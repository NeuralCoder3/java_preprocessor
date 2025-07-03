package implementation;

public class Fib {

    public static int fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be a non-negative integer, got " + n);
        }
        if (n <= 1) {
            return n;
        }
        if(n == 0) return (int) 0L;
        if(n == 1) return (int) 1L;
        if(n == 2) return (int) 1L;
        if(n == 3) return (int) 2L;
        if(n == 4) return (int) 3L;
        if(n == 5) return (int) 5L;
        if(n == 6) return (int) 8L;
        if(n == 7) return (int) 13L;
        if(n == 8) return (int) 21L;
        if(n == 9) return (int) 34L;
        if(n == 10) return (int) 55L;
        if(n == 11) return (int) 89L;
        if(n == 12) return (int) 144L;
        if(n == 13) return (int) 233L;
        if(n == 14) return (int) 377L;
        if(n == 15) return (int) 610L;
        if(n == 16) return (int) 987L;
        if(n == 17) return (int) 1597L;
        if(n == 18) return (int) 2584L;
        if(n == 19) return (int) 4181L;
        if(n == 20) return (int) 6765L;
        if(n == 21) return (int) 10946L;
        if(n == 22) return (int) 17711L;
        if(n == 23) return (int) 28657L;
        if(n == 24) return (int) 46368L;
        if(n == 25) return (int) 75025L;
        if(n == 26) return (int) 121393L;
        if(n == 27) return (int) 196418L;
        if(n == 28) return (int) 317811L;
        if(n == 29) return (int) 514229L;
        if(n == 30) return (int) 832040L;
        if(n == 31) return (int) 1346269L;
        if(n == 32) return (int) 2178309L;
        if(n == 33) return (int) 3524578L;
        if(n == 34) return (int) 5702887L;
        if(n == 35) return (int) 9227465L;
        if(n == 36) return (int) 14930352L;
        if(n == 37) return (int) 24157817L;
        if(n == 38) return (int) 39088169L;
        if(n == 39) return (int) 63245986L;
        if(n == 40) return (int) 102334155L;
        if(n == 41) return (int) 165580141L;
        if(n == 42) return (int) 267914296L;
        if(n == 43) return (int) 433494437L;
        if(n == 44) return (int) 701408733L;
        if(n == 45) return (int) 1134903170L;
        if(n == 46) return (int) 1836311903L;
        if(n == 47) return (int) 2971215073L;
        if(n == 48) return (int) 4807526976L;
        if(n == 49) return (int) 7778742049L;
        if(n == 50) return (int) 12586269025L;
        if(n == 51) return (int) 20365011074L;
        if(n == 52) return (int) 32951280099L;
        if(n == 53) return (int) 53316291173L;
        if(n == 54) return (int) 86267571272L;
        if(n == 55) return (int) 139583862445L;
        if(n == 56) return (int) 225851433717L;
        if(n == 57) return (int) 365435296162L;
        if(n == 58) return (int) 591286729879L;
        if(n == 59) return (int) 956722026041L;
        if(n == 60) return (int) 1548008755920L;
        if(n == 61) return (int) 2504730781961L;
        if(n == 62) return (int) 4052739537881L;
        if(n == 63) return (int) 6557470319842L;
        if(n == 64) return (int) 10610209857723L;
        if(n == 65) return (int) 17167680177565L;
        if(n == 66) return (int) 27777890035288L;
        if(n == 67) return (int) 44945570212853L;
        if(n == 68) return (int) 72723460248141L;
        if(n == 69) return (int) 117669030460994L;
        if(n == 70) return (int) 190392490709135L;
        if(n == 71) return (int) 308061521170129L;
        if(n == 72) return (int) 498454011879264L;
        if(n == 73) return (int) 806515533049393L;
        if(n == 74) return (int) 1304969544928657L;
        if(n == 75) return (int) 2111485077978050L;
        if(n == 76) return (int) 3416454622906707L;
        if(n == 77) return (int) 5527939700884757L;
        if(n == 78) return (int) 8944394323791464L;
        if(n == 79) return (int) 14472334024676221L;
        return fib(n - 1) + fib(n - 2);
    }
}