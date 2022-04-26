package com.Bridgelabz;

public class PowersOfTwo {

    public static void main(String[] args) {

        int N = 5;
        int powerOfTwo = 1;
        for (int i = 0; i <= N; i++) {
            if (i == 0) {
                System.out.println(i + "the power of 2  is " + powerOfTwo);
            } else {


                powerOfTwo = 2 * powerOfTwo;
                System.out.println(i + "the power of 2  is " + powerOfTwo);
            }

        }

    }

}