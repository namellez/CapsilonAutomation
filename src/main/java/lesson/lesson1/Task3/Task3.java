package lesson.lesson1.Task3;

import java.util.Scanner;

public class Task3 {


    public static void drawRomb(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side length");
        int num = scan.nextInt();

        String outerSpaces = "";        //the number of space symbols outside of romb
        String innerSpaces = " ";       //the number of space symbols inside of romb

        System.out.println("Here's your romb:");
        System.out.println();

        for (int i = 0; i <num-1; i++) {            //set outer space for first row to side length minus 1
            outerSpaces = outerSpaces + " ";
        }

        System.out.println(outerSpaces + "*");      //create first row with one *

        for (int i = 0; i <num-1; i++) {                                                //create the remaining rows to form the top triangle
            System.out.println(outerSpaces.substring(i+1) + "*" + innerSpaces + "*");   //outer space is decreased by 1 with each row
            innerSpaces = innerSpaces + " " + " ";                                       //inner space is increased by 2 with each row
        }

        outerSpaces = " ";      //reset the outer space
        innerSpaces = innerSpaces.substring(4); //reset inner space

        for (int i = 0; i <num-2; i++) {                                                //create the bottom triangle
            System.out.println(outerSpaces + "*" + innerSpaces + "*");
            if (innerSpaces.length()>=2) innerSpaces = innerSpaces.substring(2);          //inner space is decreased by 2 with each row
            outerSpaces = outerSpaces + " ";                                                //outer space is encreased by 1 with each row
        }

        System.out.println(outerSpaces + "*");      //create the last row with one *
    }
}

