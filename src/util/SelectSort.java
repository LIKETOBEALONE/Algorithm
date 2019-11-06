package util;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int [] arr={7,6,5,7,8,1,2,3,0,9,8,7,-6};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void  selectSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int minIndex=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            if (i!=minIndex){
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }


        }
    }

}
