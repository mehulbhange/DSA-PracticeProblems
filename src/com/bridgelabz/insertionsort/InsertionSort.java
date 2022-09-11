package com.bridgelabz.insertionsort;

import java.util.Scanner;

public class InsertionSort {

    public void insertionSort(String[] str){
        int len = str.length;

        for (int i = 1; i < len; i++){
            int j = i;
            String temp = str[i];
            while ( j > 0 && (str[j-1].compareTo(temp) > 0) ){
                str[j] = str[j-1];
                j--;
            }
            str[j] = temp;
        }

    }

    public static void main(String[] args) {
        //"pear" "grapes" "banana" "apple" "papaya" "strawberry"

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++){
            str[i] = sc.next();
        }

        InsertionSort is = new InsertionSort();
        is.insertionSort(str);

        for (String s : str){
            System.out.print(s+" ");
        }

    }
}
