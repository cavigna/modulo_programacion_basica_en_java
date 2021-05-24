package com.nacho;

import java.util.Arrays;
//|| array[0]>array[1]
public class InsertionSort {
    public  void insertionSort(int[] array, int stop){
        if(stop<=array.length){

            insertionSort( array, stop+1);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("");
        System.out.println(stop);
        var k = 0;
        for (var i = 1; i< array.length; i++){
            if(array[i]< array[i-1]){
                System.out.println(array[i] + " < === > " + array[i-1]);
                k = array[i];
                array[i] = array[i-1];
                array[i-1]=k;
            }

        }


    }
}
