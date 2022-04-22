package exception;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner scan;
        boolean suitableRespo = false;
        int l = 0;
        while(!suitableRespo){
            try {
                System.out.println("enter input?");
                scan = new Scanner(System.in);
                l = scan.nextInt();
                suitableRespo = true;
            } catch (InputMismatchException e){
                System.out.println("Not an int");
                //Add a log that user did not enter the right option
            }
        }
        System.out.println(l);

    }



}
