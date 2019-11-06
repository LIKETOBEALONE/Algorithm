package util;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(100));
    }
    public static int fibonacci(int i) {
        if (i == 0) {
            return 0;
        } else if (i == 1 || i == 2) {
            return 1;
        } else {
            return fibonacci(i - 1) + fibonacci(i - 2);
        }
    }

}
