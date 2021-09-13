package org.example;
import java.util.Scanner;
import java.util.Date;
/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Jose Malave
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);

        System.out.println( "How many euros are you exchanging?" );
        String euroIn= sc.nextLine();

        System.out.println( "What is the exchange rate?" );
        String rateIn = sc.nextLine();

        double euro = Double.parseDouble(euroIn);
        double rate = Double.parseDouble(rateIn);


        double US_Dollars= (double)Math.round(euro * rate * 100)/100;

        System.out.println( euroIn + " euros at an exchange rate of " + rate + " is\n" +
        US_Dollars + " U.S. dollars.");
    }
}
