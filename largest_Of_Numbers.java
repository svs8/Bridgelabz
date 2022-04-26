package com.Bridgelabz;

public class largest_Of_Numbers {

    static int largest(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        int res=largest(100,2,30);
        System.out.println("the largest of three numbers is "+res);

    }
}
