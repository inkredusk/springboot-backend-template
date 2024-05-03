package com.redvinca.backend.template.service;

public class Fibonacci {
    /**
     * This method generates the Fibonacci series up to the given number.
     * @param n the number upto which the Fibonacci series is to be generated.
     * @return an array containing the Fibonacci series.
     */
    public static int[] fibonacciSeries(int n) {
        int[] result = new int[n]; // declaring and initializing the result array
        int first = 0, second = 1, next; // declaring and initializing the variables
        result[0] = first; // setting the first element of the result array
        result[1] = second; // setting the second element of the result array
        for (int i = 2; i < n; i++) { // starting the loop
            next = first + second; // calculating the next number in the series
            first = second; // updating the first variable
            second = next; // updating the second variable
            result[i] = next; // setting the i-th element of the result array
        }
        return result; // returning the result array
    }

    public void checkCondition() {
        int num = 0;
        if(num > 0) {
            System.out.println("greater than zero");
        }else if(num < 0) {
            System.out.println("less than zero");
        }
        else {
            System.out.println("equal to zero");
        }
    }

}
