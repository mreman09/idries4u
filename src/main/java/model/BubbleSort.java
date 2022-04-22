package model;

import view.Printer;

import java.util.Arrays;

public class BubbleSort implements Sorter {
    private static int[] numberArray;


    @Override
    public int[] sortArray(int[] inputArray) {
        int n = inputArray.length;

        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (inputArray[j] > inputArray[j + 1]) {
                    // swap inputArray[j+1] and inputArray[j]
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                }
        Printer.printArray(inputArray);
        return numberArray;
    }


}