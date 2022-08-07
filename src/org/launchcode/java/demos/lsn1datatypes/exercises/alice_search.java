package org.launchcode.java.demos.lsn1datatypes.exercises;

import java.util.Scanner;

public class alice_search {

    public static void main (String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        String wonderland = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("Enter a term to search for within wonderland!");
        String aliceSearch = input.nextLine().toLowerCase();
        int index = wonderland.toLowerCase().indexOf(aliceSearch);

        if(index == -1 || aliceSearch.length() == 0){
            System.out.println(aliceSearch + " not found!\n");
        } else {
            System.out.println("Found " + aliceSearch + " @ index " + index + " with a word length of " + aliceSearch.length() );
            String test = wonderland.replace(aliceSearch, "");
            System.out.println(test);

        }

    }
}

