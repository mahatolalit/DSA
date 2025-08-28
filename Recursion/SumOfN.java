package Recursion;

public class SumOfN {
    static int func(int n) {
        return n < 1 ? 0 : n + func(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum of first " + n + " natural numbers = " + func(n));
    }
}