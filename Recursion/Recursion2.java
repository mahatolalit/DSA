package Recursion;

public class Recursion2 {
    static void func(int i, int n) {
        if(i > n) return;
        System.out.println(i);
        func(i+1,n);
    }

    public static void main(String[] args) {
        int i=1, n=10;
        func(i,n);
    }
}
