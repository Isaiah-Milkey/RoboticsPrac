package test;

import java.util.Scanner;


class SchoolGrading {
    public static void main(String[] args) {
    //    Scanner = gradeScanner = new Scanner (System.in);
    Scanner gradeScanner = new Scanner (System.in);
       int grade = gradeScanner.nextInt();
      

        if (grade <= 100 && grade >= 90) {
            System.out.println("A");
        }

        if (grade <= 89 && grade >= 80) {
            System.out.println("B");
        }

        if (grade <= 79 && grade >= 70){
            System.out.println("C");
        }

        if (grade <= 69 && grade >= 60){
            System.out.println("D");
        }

        if (grade <= 59 && grade >= 0){
            System.out.println("F");
        }

        if (grade <= 0) {
            System.out.println("Not Possible");
        }
            else if (grade >= 100 ) {
                System.out.println("Not Possible");
            }
        

    }
}