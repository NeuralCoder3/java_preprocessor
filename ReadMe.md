The trick is to find a general enough/simple metaprogramming language that one can easily embed/use it.

There are many possibilities:
- Generate classes on the fly via Reflection => we can't edit them, it is a bit tedious, at runtime; but it directly supports deeply embedded and typed Java constructs
- Generate the code externally => we need to write a tool but it is completely independent
- Generate the code via preprocessing => easy to write, can be transformed once or via preprocessing path



Often, you don't even need a preprocessor. [Dependency injection](https://www.vogella.com/tutorials/DependencyInjection/article.html) and Dataclasses/annotations are quite powerful on their own.

For other cases, the last two seem promising.
We have seen option 2 in the MonRogue project where we created all the data classes automatically from the data via python.
For the effectiveness, there are some options:
- One could just write a table and read from it at runtime
- One could translate the typescript code from PokeRogue to Java via metaprogramming/transpilation
- One could translate a text representation at runtime
- One could build custom structures at compiletime that encode the data

Here (and for natures, ...), the simple datastructure is the cleanest and best variant.

Back to the classes, we could write a python script to generate all.
But this is tedious and needs to be complex enough to handle all the cases you mention.
Also, it is too easy to make syntax mistakes.


One would want a preprocessor like in C with macros.
Indeed, the [C preprocessor](https://en.wikipedia.org/wiki/C_preprocessor) is [not C specific](https://stackoverflow.com/questions/1099843/using-the-c-preprocessor-for-languages-other-than-c).
You can use it for any programming language. C# even often makes use of it. So why not Java?
[Here](https://medium.com/@petersontrethewey/the-secret-java-preprocessor-b422296177a2) is even a tutorial about it.
Then there are a few Java specific preprocessor like [Manifold](https://devm.io/java/manifold-preprocessor-for-java-160712), [SJPP](https://github.com/plantuml/sjpp).

One could also use a custom universal preprocessor.
[For one paper](https://github.com/NeuralCoder3/cgo25_artifact/blob/master/planning/meta.py), I wrote one in python that preprocesses arbitrary files.
You just write python code inside your other files and the output is placed into the files.

If you want a better typed and more professional system, [AntiLisp](https://antilisp.com/) provides metaprogramming via Lisp. The functional nature and homoiconicity of Lisp make it ideal for this task.

Lastly, one could use other JVM languages like Kotlin.
Many have good metaprogramming facilities and less boilerplate.
Then, one interfaces with these languages.