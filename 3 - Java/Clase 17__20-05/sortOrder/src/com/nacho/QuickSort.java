package com.nacho;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public void quickSort(int [] array, int izquierda, int derecha){
        if(izquierda<derecha){
            int particion_pos =particion(array, izquierda, derecha);
            quickSort(array, izquierda, particion_pos-1);
            quickSort(array, particion_pos+1, derecha);
        }
    }

    private  int particion(int[] array, int izquierda, int derecha){
        int i = izquierda, j = derecha, k;
        int pivot = array[derecha];

        while (i<j) {
            System.out.printf("Array = %s%n", Arrays.toString(array));
            while(i<derecha && array[i]<pivot){
                i++;
            }
            while(j>i && array[j]>= pivot){
                j--;
            }
            if(i<j){ // Si i es MENOR a j
                System.out.println();
                System.out.println("*** i menor a j ***");
                System.out.println();
                System.out.printf("Pivot = %d %n",pivot);

                System.out.printf("%narray[%s] = %s <==> array[%s] = %s %n", i, array[i], j, array[j]);
                System.out.println();
                k = array[i];
                array[i] = array[j];
                array[j] =k; // SWAP array[i] por array[j]

            }

        }

        while(array[i]>pivot){
            System.out.println();
            System.out.println("*** j mayor a i ***");
            System.out.println();
            System.out.printf("Pivot = %d %n",pivot);

            System.out.printf("%narray[%s] = %s <==> array[%s](Pivot) = %s %n", i, array[i], derecha, array[derecha]);
            System.out.println();
            k = array[i];
            array[i] = array[derecha];
            array[derecha] =k;
        }


        return i;
    }

}























/*
    public void quickSort(int [] array){
        System.out.println(Arrays.toString(array));
        quickSort(array, 0 , array.length-1);
        System.out.println(Arrays.toString(array));


    }
    private void quickSort(int[] array, int min, int max){
         if (min < max+1){
             int p = particion(array, min, max);
             quickSort(array, p+1, max);
         }
    }
    private void swap(int [] array, int i, int j){
        int k = array[i];
        array[i] = array[j];
        array[j] = k;
    }
    private int pivot(int min, int max){
        Random random = new Random();
        return random.nextInt((max-min)+1)+min ;
    }

    private  int particion(int [] array, int min, int max){
        swap(array, min, pivot(min, max));
        int limite = min + 1;
        for (int i=limite; i<= max; i++){
            if(array[i]<array[max]){
                swap(array, i, limite++);
            }
        }
        swap(array, min, limite-1);
        return limite-1;
    }
 */