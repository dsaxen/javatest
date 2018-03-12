package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        Initialize the first two values of the fibonacci sequence
        The sequence starts with 1,1..
         */
	    int number1 = 1;
	    int number2 = 1;

	    int total;

        System.out.println();

	    for(int i = 0; i < 42; i++){ //loop 42 times (the meaning of life)

            total = number1 + number2; //fibonacci definition

            number1 = number2; //update the numbers to be added
            number2 = total;

            System.out.println("Value number " + (i+1) + ": " + total +"\n"); //we print out the first 42 fibonacci values, once each loop
        }
    }
}
