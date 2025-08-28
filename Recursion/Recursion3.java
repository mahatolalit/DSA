package Recursion;

public class Recursion3 {
    static void func(int i, int n) {
        if(i < 1) return;
        System.out.println(i);
        func(i-1,n);
    }

    public static void main(String[] args) {
        int n=10;
        func(n,n);
    }
}