package com.nav.hundred.ten;

/**
 * Multiples of 3 and 5
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class One {

    public static int sumOfThreeOrFive(int belowNumber){
        int sum = 0;
        for(int i = 3; i < belowNumber; i++){
            if(i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println("Sum of 3 or 5 below entered number: "+sumOfThreeOrFive(1000));
    }
}
