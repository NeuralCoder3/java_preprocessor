package implementation;

public class Fib {

    public static int fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be a non-negative integer, got " + n);
        }
        if (n <= 1) {
            return n;
        }
        if(n == 0) return 0L;
        if(n == 1) return 1L;
        if(n == 2) return 1L;
        if(n == 3) return 2L;
        if(n == 4) return 3L;
        if(n == 5) return 5L;
        if(n == 6) return 8L;
        if(n == 7) return 13L;
        if(n == 8) return 21L;
        if(n == 9) return 34L;
        if(n == 10) return 55L;
        if(n == 11) return 89L;
        if(n == 12) return 144L;
        if(n == 13) return 233L;
        if(n == 14) return 377L;
        if(n == 15) return 610L;
        if(n == 16) return 987L;
        if(n == 17) return 1597L;
        if(n == 18) return 2584L;
        if(n == 19) return 4181L;
        if(n == 20) return 6765L;
        if(n == 21) return 10946L;
        if(n == 22) return 17711L;
        if(n == 23) return 28657L;
        if(n == 24) return 46368L;
        if(n == 25) return 75025L;
        if(n == 26) return 121393L;
        if(n == 27) return 196418L;
        if(n == 28) return 317811L;
        if(n == 29) return 514229L;
        if(n == 30) return 832040L;
        if(n == 31) return 1346269L;
        if(n == 32) return 2178309L;
        if(n == 33) return 3524578L;
        if(n == 34) return 5702887L;
        if(n == 35) return 9227465L;
        if(n == 36) return 14930352L;
        if(n == 37) return 24157817L;
        if(n == 38) return 39088169L;
        if(n == 39) return 63245986L;
        if(n == 40) return 102334155L;
        if(n == 41) return 165580141L;
        if(n == 42) return 267914296L;
        if(n == 43) return 433494437L;
        if(n == 44) return 701408733L;
        if(n == 45) return 1134903170L;
        if(n == 46) return 1836311903L;
        if(n == 47) return 2971215073L;
        if(n == 48) return 4807526976L;
        if(n == 49) return 7778742049L;
        if(n == 50) return 12586269025L;
        if(n == 51) return 20365011074L;
        if(n == 52) return 32951280099L;
        if(n == 53) return 53316291173L;
        if(n == 54) return 86267571272L;
        if(n == 55) return 139583862445L;
        if(n == 56) return 225851433717L;
        if(n == 57) return 365435296162L;
        if(n == 58) return 591286729879L;
        if(n == 59) return 956722026041L;
        if(n == 60) return 1548008755920L;
        if(n == 61) return 2504730781961L;
        if(n == 62) return 4052739537881L;
        if(n == 63) return 6557470319842L;
        if(n == 64) return 10610209857723L;
        if(n == 65) return 17167680177565L;
        if(n == 66) return 27777890035288L;
        if(n == 67) return 44945570212853L;
        if(n == 68) return 72723460248141L;
        if(n == 69) return 117669030460994L;
        if(n == 70) return 190392490709135L;
        if(n == 71) return 308061521170129L;
        if(n == 72) return 498454011879264L;
        if(n == 73) return 806515533049393L;
        if(n == 74) return 1304969544928657L;
        if(n == 75) return 2111485077978050L;
        if(n == 76) return 3416454622906707L;
        if(n == 77) return 5527939700884757L;
        if(n == 78) return 8944394323791464L;
        if(n == 79) return 14472334024676221L;
        return fib(n - 1) + fib(n - 2);
    }
}