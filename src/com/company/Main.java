package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        int testArray[] = {687, 12, 6, 4, 1, 23, 345, 0, 9, 9, 45896, 23, 2};
        System.out.println(Arrays.toString(testArray));

//        selectSort(testArray);
//        bubbleSort(testArray);
        insertSort(testArray);

    }

    public static void insertSort(int arr[]) {

        for (int j = 1; j < arr.length; j++) {
            int selected = j;
            for (int i = 0; i < j; i++) {
                if (arr[i] > arr[selected]) {
                    int temp = arr[selected];
                    arr[selected] = arr[i];
                    arr[i] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }


    public static void bubbleSort(int arr[]) {

        for (int j = arr.length; j > 0; j--) {
            for (int i = 0; i < j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int arr[]) {
        for (int j = 0; j < arr.length - 1; j++) {
            int minIndex = j;
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }
            int tmp = arr[minIndex];
            arr[minIndex] = arr[j];
            arr[j] = tmp;

        }
        System.out.println(Arrays.toString(arr));
    }
}