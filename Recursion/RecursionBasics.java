package Recursion;

public class RecursionBasics {
    static void recur(int i, int n) {
        // Base case: if current value of i is greater than n, stop recursion
        if (i > n) return;

        // Print for the current value of i
        System.out.println(i + " Lalit");

        recur(i+1,n);

    }

    public static void main(String[] args) {
        int n=10;
        recur(1, n);
    }
}
