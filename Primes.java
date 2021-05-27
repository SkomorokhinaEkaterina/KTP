package com.company;

public class Primes {

    public static void main(String[] args) {
        for (int n = 2; n<101; n++)
            if (isPrime(n))
                System.out.print(n+"");
	// функция определяет является ли число простым
    }

    private static boolean isPrime(int n)
    {
        for (int k = 2; k<10; k++)
            if ((n%k==0)&&(n!=k))
                return false;
            return true;
    }
}
