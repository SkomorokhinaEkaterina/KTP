package com.company;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println("java " + isPalindrome("java"));
        System.out.println("madam " + isPalindrome("madam"));
        System.out.println("song " + isPalindrome("coffee"));
        System.out.println("noon " + isPalindrome("LOL"));
        System.out.println("Palindrome " + isPalindrome("java"));
        System.out.println("racecar " + isPalindrome("madam"));
        System.out.println("apple " + isPalindrome("coffee"));
        System.out.println("kayak " + isPalindrome("LOL"));
        // write your code here
    }

    //Метод, выполняющий разворот строки
    public static String reverseString(String word) {
        String p = "";
        for (int i = word.length() - 1; i > -1; i--)
            p = p + word.charAt(i);
        return (p);
    }

    //Метод проверяет, является ли строка палиндромом
    public static boolean isPalindrome(String p)
    {
        return (p.equals(reverseString(p)));
    }
}
