package test.ArrayPrac;

impor       t java.util.Arrays;
import java.util.ArrayList;

public class arrayPractice {
    public  tatic void main(String[] args) {

                int[] test   = { 4, 6, 8, 10, 12 };
            // printAll(test);

        }

        public static void printAll(int[] test) {
        for (   int i = 0;   < test.length; i++) {
            System.out.println(test[i]);
        }   
        }

    public static int smallestNumber(int[] test) {
            int smallestNumber = test[0];
                for (int i = 1; i < test.length; i++) {
                    if (test[i] < smallestNumber) {
                        smallestNumber = test[i];
                }

        }

        return smallestNumber;
        // NOT FINISHED ( SMALLEST NUMBER DOESNT WORK YET)
    }

}