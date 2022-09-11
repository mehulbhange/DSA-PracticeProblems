package com.bridgelabz.binarysearch;

public class BinarySearchWord {

    public int searchWord(String[] str, int low, int high, String key){
        if (high >= low){
            int mid = (low+high)/2;
            if(str[mid] == key){
                return mid;
            }else if (key.compareTo(str[mid]) < 0){
                return searchWord(str,low,mid-1,key);
            }else if (key.compareTo(str[mid]) > 0){
                return searchWord(str,mid+1,high,key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] str = {"apple", "banana", "grapes", "papaya", "pear", "strawberry"};
        int len = str.length;
        BinarySearchWord binarySearchWord = new BinarySearchWord();

        int res = binarySearchWord.searchWord(str, 0, len-1, "grapes");
        if ( res == -1)
            System.out.println("Not found!");
        else {
            System.out.println("Found at index "+ res );
        }
    }

}
