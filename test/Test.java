package test;

import java.util.Scanner;


class Test {
    public static void main(String[] args) {
        //Give command
        System.out.println("Please enter a number");

       //initiate scanner 
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();

//create for loop to create each multiplication
    int factorial = 1 ;
    for (int i = 1; i <= number; i++) {
        factorial = factorial * i;
    }
        System.out.println("The factorial of " + number + " is " + factorial);
        scanner.close();
    }
 }