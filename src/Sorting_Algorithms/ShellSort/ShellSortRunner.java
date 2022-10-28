package Sorting_Algorithms.ShellSort;

import java.util.Arrays;

public class ShellSortRunner {
    public static void main(String[] args) {
        int [] arr1={7,5,4,1,9,3,2,2}; 
        System.out.println("SSort olmadan onceki liste : ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("******************************");
        ShellSort.shellSort(arr1);
        System.out.println("SSort sonrasi liste : ");
        System.out.println(Arrays.toString(arr1));
    }
}
