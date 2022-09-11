package com.bridgelabz.bubblesort;

import java.util.Scanner;

public class BubbleSort {

    public void sort(int[] arr){
        int len = arr.length;

        for (int i = 0; i < len; i++){
            for (int j = 0; j < len-i-1; j++){
                if ( arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        // 40 30 50 10 15 80 60
        Scanner sc = new Scanner(System.in);
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Enter number of elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        bubbleSort.sort(arr);
        for (int x : arr){
            System.out.print(x + " ");
        }
    }
}
