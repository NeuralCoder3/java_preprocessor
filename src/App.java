import implementation.Fib;

public class App {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as an argument.");
            return;
        }
        int n = Integer.parseInt(args[0]);
        int result = Fib.fib(n);
        System.out.println(String.format("The %dth Fibonacci number is: %d", n, result));
    }

}