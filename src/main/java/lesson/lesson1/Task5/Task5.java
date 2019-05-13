package lesson.lesson1.Task5;

import java.util.Scanner;

public class Task5 {

    public static void guessTheName() {

        final String name = "Volski Stepan";            //the name to be guessed
        boolean correctGuess = false;                   //flag to show if we have guessed any letter
        String attempts = "";                           //String that contains all previous attempts

        char[] answer = new char[name.length()];        //array that will have all *
        int space = name.indexOf(' ');

        for (int i = 0; i < name.length(); i++) {       //fill the * array
            answer[i] = '*';
            if (i == space) answer[i] = ' ';
        }

        while (new String(answer).contains("*")) {      // the loop will run until there are unguessed letters

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a single letter or a whole word: ");


            if (scan.hasNextInt() || scan.hasNextDouble()) {          //check to see if input is a number
                System.out.println("You didn't enter a letter or a word. Try again!");
                continue;
            }

            String str = scan.nextLine();

            if (attempts.contains(str)) {        //check if the letters have already been used before
                System.out.println("This letter / word has already been used! Try again!");
                System.out.println();
                continue;
            } else {
                attempts = attempts + str;
            }

            char[] input = str.toLowerCase().toCharArray();

            for (char a : input                 //compare entered letters with our name, if match => replace the * with guessed letter and change flag
            ) {
                for (int i = 0; i < answer.length; i++) {
                    if (a == name.toLowerCase().charAt(i)) {
                        answer[i] = a;
                        correctGuess = true;
                    }
                }
            }

            if (correctGuess) {
                System.out.println("You have guessed a letter!");
                for (int i = 0; i < name.length(); i++) {
                    System.out.print(answer[i]);
                }
                correctGuess = false;               //reset the flag
            } else {
                System.out.println("You didn't guess any letters");
            }

            System.out.println();

        }

        System.out.println("Congratulations! You have guessed the name!");
    }
}
