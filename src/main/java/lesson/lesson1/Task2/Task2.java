package lesson.lesson1.Task2;

import java.util.Scanner;

public class Task2 {

    public static void showDayName(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day number");
        int num = scan.nextInt();

        switch(num) {
            case 1:
                System.out.println("Monday!");
                break;
            case 2:
                System.out.println("Tuesday!");
                break;
            case 3:
                System.out.println("Wednesday!");
                break;
            case 4:
                System.out.println("Thursday!");
                break;
            case 5:
                System.out.println("Friday!");
                break;
            case 6:
                System.out.println("Saturday!");
                break;
            case 7:
                System.out.println("Sunday!");
                break;

            default:
                System.out.println("No such day!");
        }

    }
}

