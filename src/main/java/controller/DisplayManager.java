package controller;

import model.ArrayGenerator;
import model.BubbleSort;
import model.SortOptions;
import model.Sorter;
import view.Printer;

public class DisplayManager {
    public static void start() {
        Printer.startMessage();
        UserRequest.start();
        int[] hold = ArrayGenerator.generator(UserRequest.userInput);
        Printer.printIntArray(hold);
        //Printer.printIntArray(ArrayGenerator.generator(UserRequest.userInput));
        Printer.typeOfSort();
        UserRequest.start();
        Sorter s = SortOptions.getSort(UserRequest.userInput);
        s.sortArray(hold);
        Printer.printArray(hold);
       // SortOptions.getSort(UserRequest.userInput, hold);
       // Printer.printArray();


    }
}
