package org.launchcode.java.exercises.datatypes;

import java.util.Scanner;

public class numeric_types_mile {

    public static void main (String[] args) {
        Scanner input;
        int milesDriven;
        int gallonsUsed;
        int milesPerGallon;

        input = new Scanner(System.in);
        System.out.println("How many miles did you drive?");
        milesDriven = Integer.parseInt(input.nextLine());
        System.out.println("How many gallons did you use?");
        gallonsUsed = Integer.parseInt(input.nextLine());
        milesPerGallon = milesDriven / gallonsUsed;
        System.out.println("Your average mpg is " + milesPerGallon);


    }
}
