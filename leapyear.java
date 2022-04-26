package com.Bridgelabz;

public class leapyear {

   // static int[] year = new int[4];
    static int year;
    static void leap_year(int year){
        if(year%400==0 || year%4==0 && year%100!=0)
        {
            System.out.println("year "+year+" is an leap year ");
        }
        else {
            System.out.println("year "+year+" is an not an leap year");
        }

    }
    public static void main(String[] args) {
        leap_year(2021);

    }
}
