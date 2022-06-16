package com.codedifferently;

public class BinarySearch {
    public static void main(String[] args) {

    }
    public static Boolean binarySearch(int[] numbers, int value){
        int low = 0;
        int high = numbers.length - 1;
        while(high >= low){
            int middle = (low + high)/2; // Middle index
            if(numbers[middle] == value){
                return true ; //Target value was found
            }//endif
            if(numbers[middle] < value){
                low = middle + 1;
            }//endif
            if(numbers[middle] > value){
                high = middle - 1;
            }//endif
        }//endwhile //The value was not found
        return false;

    }

}
