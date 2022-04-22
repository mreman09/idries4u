package view;

import java.util.Arrays;

public class Printer {
    public static void printIntArray(int[] numberArray) {
        System.out.println("\n");
        System.out.println("Un-ordered array currently holds");
        System.out.println(Arrays.toString(numberArray));
    }

    public static void startMessage(){
        System.out.println("Welcome to Remans sort Manager. \nHow big would you like your array to be?");
    }
    public static void typeOfSort() {
        System.out.println("\nHow would you like to sort it? \n\n1:Bubble Sort \n2:Merge Sort \n\nPlease enter a number");
    }
    public static void printArray(int[] sorted){
        System.out.println(Arrays.toString(sorted));
    }


}
