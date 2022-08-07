package org.launchcode.java.demos.lsn1datatypes.exercises;

import java.util.Scanner;

public class numeric_types_rectangle {

   public static void main (String[] args) {
       Scanner input;
       int rectangleLength;
       int rectangleWidth;
       int areaOfRectangle;

       input = new Scanner(System.in);
       System.out.println("What is the length of the rectangle?");
       rectangleLength = Integer.parseInt(input.nextLine());
       System.out.println("What is the width of the rectangle?");
       rectangleWidth = Integer.parseInt(input.nextLine());
       areaOfRectangle = rectangleLength * rectangleWidth;
       System.out.println("The area of your rectangle is " + areaOfRectangle);
   }
}
