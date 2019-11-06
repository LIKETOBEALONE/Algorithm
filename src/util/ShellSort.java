package util;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {
        int[] arr=new int[]{9,8,7,6,2,4,7,0,7,69,8};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shellSort(int[] arr){
        for (int i = arr.length/2; i >0; i/=2) {
            for (int j = i; j <arr.length; j++) {
                for (int k = j-i; k >=0;k-=i) {
                    if (arr[k]>arr[k+i]){
                        int temp=arr[k];
                        arr[k]=arr[k+i];
                        arr[k+i]=temp;
                    }
                }
            }
        }
    }
}
