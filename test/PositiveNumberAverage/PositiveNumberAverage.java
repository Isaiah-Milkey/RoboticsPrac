package test.PositiveNumberAverage;

import java.util.Scanner;

class PositiveNumberAverage {
    public static void main(String[] args) {

        // make average variable and counter
        double average = 0;
        double counter = 0;

        // initialize scanner object
        Scanner scanner = new Scanner(System.in);

        // while loop
        while (true) {
            System.out.println("Type a number");
            int number = scanner.nextInt();

            // test if input is 0
            if (number == 0) {
                break;
            }

            // test whether input is not 0
            if (number > 0) {

                average += number;
                counter++;
            }
        }

        if (average == 0 || counter == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            average /= counter;
            System.out.println("The average is " + average);
        }

        // test whether input is positive and add to variable

        // test whether variable is equal to 0
        // if it is, "Cannot calculate the average"

        // divide variable by number of numbers inputted

    }
}