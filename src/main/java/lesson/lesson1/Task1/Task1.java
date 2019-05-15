package lesson.lesson1.Task1;

import java.util.Scanner;

public class Task1 {

    public static void reverseSentence() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String str = scan.nextLine();

        char[] ar = str.toCharArray();

        System.out.println("Here is your sentence is reverse:");

        for (int i = ar.length - 1; i >= 0; i--) {
            System.out.print(ar[i]);
        }
    }

    public static void splitSentence() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String str = scan.nextLine();

        String[] ar = str.split(" ");

        System.out.println("Here is your sentence word by word:");

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }

    public static void spaceReplace() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String str = scan.nextLine();

        System.out.println("Here is your sentence with replaced spaces:");
        System.out.println(str.replace(" ", "*"));
    }

    public static void makeUpperCase() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String str = scan.nextLine();

        System.out.println("Here is your sentence in all upper case:");
        System.out.println(str.toUpperCase());
    }

    public static void showTrimmedSentence() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String str = scan.nextLine();

        if (str.length() < 10) {
            System.out.println("your sentence is too short");
        } else {
            System.out.println("Here is your sentence from 5th to 10th char: " + str.substring(4, 10));
        }
    }

}

