package com.Bridgelabz;

public class Vowel {
    static char ch = 'a';

    public static void main(String[] args) {
        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch+" is an vowel");
            } else {
                System.out.println(ch+" is an consonant");
            }
        } else {
            System.out.println(ch+" is not an Alphabet");
        }

    }
}

