package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {



    public static void main (String[] args) {
        Scanner input;
        Double radiusOfCircle;
        Double area;
        Double pi = 3.14;
        input = new Scanner(System.in);


        System.out.println("Please enter the radius of the circle.");
        radiusOfCircle = input.nextDouble();

        try {
            //  Block of code to try
        }
        catch(Exception e) {
            //  Block of code to handle errors
        }



        while (radiusOfCircle < 0) {
            System.out.println("Please enter a positive number.");
            radiusOfCircle = input.nextDouble();
            break;
        }
        area = pi * radiusOfCircle * radiusOfCircle;
//      System.out.println("\n The area of your circle is " + area);
        System.out.println(Circle.getArea(radiusOfCircle));
    }






}
