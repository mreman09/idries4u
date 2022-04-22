package model;

public class SortOptions {
    public static Sorter getSort(int typeOfSort){
        int option = typeOfSort;

        switch(option) {
            case 1:
                return new BubbleSort();
            case 2:
                return new MergeSort();
            default:
                return null;
        }
    }

//    public static Sorter getSort(int typeOfSort, int[] hold){
//        int option = typeOfSort;
//        BubbleSort l = new BubbleSort();
//        MergeSort m = new MergeSort();
//
//        switch(option) {
//            case 1:
//                l.sortArray(hold);
//            case 2:
//                m.sortArray(hold);
//            default:
//                return null;
//        }
//    }
}

