package org.launchcode;

import java.util.Scanner;


public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//basic solution
//        System.out.println("Please enter a radius: ");
//        double radius = input.nextDouble();
//        double area = Circle.getArea(radius);
//        System.out.println("The area of a circle with a radius of " + radius + " is: " + area);


//        Bonus Mission 1
//        System.out.println("Please enter a radius: ");

//        this checks here for if the user has put in the right type
//        this is checked before it is stored
//        if (input.hasNextDouble()) {
//            double radius = input.nextDouble();
//
//
////            this will calculate the area, and print out the message as long as true
//            if (radius > 0) {
//                double area = Circle.getArea(radius);
//                System.out.println("The area of a circle with a radius of " + radius + " is: " + area);
//            }else {
//                System.out.println("Sorry the radius must be a positive number.");
//            }
//
////            informs user they didn't input a valid number
//        } else {
//            System.out.println("Sorry, that was not a valid number.");
//        }

//        Bonus Mission 2 - the reprompt working with loops in the scanner class
//        do while loop makes variable out of scope unless declaredin look

        double radius;

        do {
            System.out.println("Please enter a positive number for the radius: ");


//            this hasNextDouble is just checking the proper type and if not gives the prompt
            while (!input.hasNextDouble()){
                System.out.println("The radius must be a number! Try again!");
                input.next();
            }
//            this is where we actually store it after validation
            radius = input.nextDouble();

        } while (radius <= 0);

        double area = Circle.getArea(radius);
        System.out.println("The area of a circle with a radius of " + radius + " is: " + area);

        input.close();
    }

}
