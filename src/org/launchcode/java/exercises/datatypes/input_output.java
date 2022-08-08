package org.launchcode.java.exercises.datatypes;

import java.util.Scanner;

public class input_output {

    public static void main (String[] args) {
        String greeting = "Hello world!";
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String name = input.nextLine();
        System.out.println("Hello "+ name + "!");
        input.close();

    }
}




