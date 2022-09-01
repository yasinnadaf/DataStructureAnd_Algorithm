package com.bridgelabz.datastructureandalgorithm;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        boolean result = checkAnagram(str1,str2);
        if(result)
            System.out.println("Given string are anagram");

        else
            System.out.println("Given string are not anagrams");
    }

    public static boolean checkAnagram(String str1, String str2){
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        if (arr1.length != arr2.length){
            return false;
        }
        else{
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2)){
                return true;
            }
        }
        return false;
    }
}