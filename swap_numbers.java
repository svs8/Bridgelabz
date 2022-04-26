package com.Bridgelabz;

public class swap_numbers {
    static int a=10;
    static int b=20;
    static int temp;

    public static void main(String[] args) {
        System.out.println("value of 'a' before swapping "+a);
        System.out.println("value of 'b' before swapping "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("value of 'a' after swapping "+a);
        System.out.println("value of 'b' after swapping "+b);
    }
}
