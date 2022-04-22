package controller;

import java.util.Scanner;

public class UserRequest {
    public static int userInput = 0;

    public static void start() {

        Scanner myObject = new Scanner(System.in);
        userInput = myObject.nextInt();

    }

}
