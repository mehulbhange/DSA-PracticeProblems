package com.bridgelabz.mergesort;

public class MergeSort {

    public void merge(String[] left, String[] right, String[] arr){

        int nL = left.length;
        int nR = right.length;
        int i=0,j=0,k=0;
        while(i<nL && j<nR){
            if(left[i].compareTo(right[j]) < 0){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<nL){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<nR){
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public void mergeSort(String[] arr){
        int n = arr.length;
        if(n<2)
            return;

        int mid = n/2;
        String[] left = new String[mid];
        String[] right = new String[n-mid];

        for(int i=0;i<mid;i++)
            left[i] = arr[i];
        for(int i=mid;i<n;i++)
            right[i-mid] = arr[i];

        mergeSort(left);
        mergeSort(right);
        merge(left,right,arr);
    }

    public static void main(String[] args) {
//        //"pear" "grapes" "banana" "apple" "papaya" "strawberry"
        String[] str = {"pear","grapes","banana","apple","papaya","strawberry"};
        MergeSort ms = new MergeSort();
        ms.mergeSort(str);
        for (String x : str){
            System.out.print(x+" ");
        }

    }
}
