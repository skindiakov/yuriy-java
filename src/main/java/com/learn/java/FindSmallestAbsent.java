package com.learn.java;


public class FindSmallestAbsent {

    public   int smallestFind(int[] unsorted) {
        int[] sorted = sort(unsorted); //  Arrays.sort(unsorted);

        int minElement = sorted[0];
        int maxElement = sorted[sorted.length - 1];
        if (minElement <= 0 && maxElement <= 0) return (-1);
        for (int i = 0; i < sorted.length - 1; i++) {
            if ((sorted[i + 1] - sorted[i]) > 1 && sorted[i] > 0) {
                return sorted[i] + 1;
            }
        }
        return (maxElement + 1);
    }

    // better use  Arrays.sort(unsorted); It will work much faster
    private  int[] sort(int[] unsorted) {
        int temp;
        for (int i = 0; i < unsorted.length; i++) {
            for (int j = i + 1; j < unsorted.length; j++) {
                if (unsorted[i] > unsorted[j]) {
                    temp = unsorted[j];
                    unsorted[j] = unsorted[i];
                    unsorted[i] = temp;
                }
            }
        }
        return unsorted;
    }
}