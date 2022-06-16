package com.codedifferently;

public class SequentialSearchExample {
    public static void main(String[] args) {

    }
    public static Boolean sequentialSearch(int[] numbers, int value) {
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == value) {
                return true;
            }
        }
       return false;
    }
}
