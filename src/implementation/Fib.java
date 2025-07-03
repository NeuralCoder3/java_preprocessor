package implementation;

public class Fib {

    public static int fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be a non-negative integer, got " + n);
        }
        if (n <= 1) {
            return n;
        }
        <%python
        def fib(n):
            a, b = 0, 1
            for _ in range(n):
                a, b = b, a + b
            return a
        for i in range(80):
            print(f"{space}if(n == {i}) return {fib(i)}L;")
        %>
        return fib(n - 1) + fib(n - 2);
    }
}
