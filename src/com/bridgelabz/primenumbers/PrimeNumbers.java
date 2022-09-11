package com.bridgelabz.primenumbers;

import java.util.ArrayList;

public class PrimeNumbers {

    private ArrayList<Integer> primeNumbers = new ArrayList<>();
    public void findPrimeNumbers(){
        boolean isPrime = true;
        for (int i = 2; i <= 1000; i++){
            for(int j = 2; j < i; j++ ){
                if( i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                primeNumbers.add(i);
            }
            isPrime = true;
        }
    }
    public static void main(String[] args) {

        PrimeNumbers prime = new PrimeNumbers();
        prime.findPrimeNumbers();
        System.out.println(prime.primeNumbers);

    }
}
