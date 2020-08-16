package com.TestMaximum;

public class TestMaximum<E extends Comparable<E>> {

    int arrayLength;
    E[] inputArray;

    TestMaximum() {

    }

    TestMaximum(E[] inputArray, int arrayLength) {
        this.inputArray = inputArray;
        this.arrayLength = arrayLength;
    }

    public E findMaximum() {
        return findMaximumValue(inputArray, arrayLength);
    }

    public <E extends Comparable> E findMaximumValue(E[] inputArray, int arrayLength) {
        E max = inputArray[0];
        
        for (int i = 1; i < arrayLength; i++) {
            if (inputArray[i].compareTo(max) > 0) {
                max = inputArray[i];
            }
        }
        printMax(max);
        return max;
    }

    private <E extends Comparable> void printMax(E max) {
        System.out.println("Maximum for " + max.getClass().getSimpleName() + " is " + max);
    }

    public static void main(String[] args) {
        Integer[] integerArray = {10 , 8, 9};
        Float[] floatArray = {2.5f,1.2f, 0.6f};
        String[] stringArray = {"Tom","Jerry","Noddy"};
        
        new TestMaximum(integerArray, integerArray.length).findMaximum();
        new TestMaximum(floatArray, floatArray.length).findMaximum();
        new TestMaximum(stringArray, stringArray.length).findMaximum();
    }
}
