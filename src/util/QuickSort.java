package util;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{13, 3, 4, 5, 1, 55, 6, 3, 44, 7,};
        quickSort(arr,0,arr.length-1);

         System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] arr, int start, int end) {

        if (start<end){int stard = arr[start];
            int low = start;
            int high = end;
            while (low < high) {
                while (low < high && stard <= arr[high]) {
                    high--;
                }
                arr[low]=arr[high];
                while (low<high&&arr[low]<=stard){
                    low++;

                }
                arr[high]=arr[low];

            }
            arr[low]=stard;
            quickSort(arr,start,low);
            quickSort(arr,low+1,low);}

    }
}
