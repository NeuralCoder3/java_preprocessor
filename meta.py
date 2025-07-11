import io
import sys
import re
import os

# Custom stdout to capture printed output


class Capturing(list):
    def __enter__(self):
        self._stdout = sys.stdout
        sys.stdout = self._stringio = io.StringIO()
        return self

    def __exit__(self, *args):
        self.extend(self._stringio.getvalue().splitlines())
        del self._stringio    # free up some memory
        sys.stdout = self._stdout


def process_string(lines):

    new_lines = []
    python_block = []
    in_python_block = False
    indent = 0

    # Custom scope for Python execution
    custom_scope = {}

    for line in lines:
        if '<%python' in line:
            in_python_block = True
            python_block = []
            indent = len(re.match(r'^\s*', line).group())
        elif '%>' in line:
            in_python_block = False
            # Remove common leading whitespace
            whitespace_count = min([len(re.match(r'^\s*', l).group())
                                   for l in python_block if l.strip()])
            python_block = [line[whitespace_count:] for line in python_block]
            # Execute the Python block in the custom scope
            # add indent to custom_scope
            custom_scope['indent'] = indent
            custom_scope['space'] = ' ' * indent
            with Capturing() as output:
                exec('\n'.join(python_block), custom_scope)
            # Replace the Python block with its stdout
            new_lines.extend(output)
        elif in_python_block:
            # Collect lines inside Python block
            python_block.append(line)
        else:
            new_lines.append(line)

    new_content = '\n'.join(new_lines)

    return new_content


def process_file(file, out_name):
    with open(file, 'r') as file:
        lines = file.read().splitlines()
    new_content = process_string(lines)
    with open(out_name, 'w') as file:
        file.write(new_content)


if __name__ == "__main__":
    if len(sys.argv) != 3:
        print("Usage: python meta.py <file> <output_file>")
        sys.exit(1)
    process_file(sys.argv[1], sys.argv[2])
