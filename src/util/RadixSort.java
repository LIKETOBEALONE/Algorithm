package util;

import java.util.Arrays;

public class RadixSort {

    public static void main(String[] args) {
        int[]arr={123,4234,545,6,67,90,341,46,7};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void radixSort(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int maxLength = (max + "").length();

        int[][] temp = new int[10][arr.length];

        int[] count = new int[10];

        for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {

            for (int j = 0; j < arr.length; j++) {

                int remainder = arr[j] / n % 10;

                temp[remainder][count[remainder]] = arr[j];

                count[remainder]++;
            }

            int index = 0;

            for (int j = 0; j < count.length; j++) {

                if (count[j] != 0) {

                    for (int k = 0; k < count[j]; k++) {

                        arr[index] = temp[j][k];

                        index++;
                    }
                    count[j] = 0;
                }
            }

        }

    }
}
