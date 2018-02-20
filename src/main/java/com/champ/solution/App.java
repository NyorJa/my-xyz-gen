package com.champ.solution;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        try {
            String[] letters = {"X", "Y", "Z"};
            int oddNumber = 3;

            LetterGenerator letterGenerator = new VerticalLetterGenerator(letters, oddNumber);
            letterGenerator.print();

            System.out.println("");

            letterGenerator = new HorizontalLetterGenerator(letters, oddNumber);
            letterGenerator.print();
        } catch (InstantiationException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, "Not an odd number", ex);
        }
    }
}
