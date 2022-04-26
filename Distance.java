package com.Bridgelabz;

public class Distance {
        public static void main(String[] args) {

            // parse x- and y-coordinates from command-line arguments
            int a = Integer.parseInt(args[0]);//convert string argument to number
            int b = Integer.parseInt(args[1]);//convert string argument to number

            // compute distance to (0, 0)
            double d= Math.sqrt(a*a + b*b);

            // output distance
            System.out.println("distance from (" + a + ", " + b + ") to (0, 0) is " + d);
        }
    }

