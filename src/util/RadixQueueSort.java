package util;

import java.util.Arrays;

public class RadixQueueSort {

    public static void main(String[] args) {
        int[] arr = {123, 4234, 545, 6, 67, 90, 341, 46, 7};
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

        MyQueue[] temp = new MyQueue[10];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = new MyQueue();
        }

        for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {

            for (int j = 0; j < arr.length; j++) {

                int remainder = arr[j] / n % 10;

                temp[remainder].add(arr[j]);

            }

            int index = 0;

            for (int j = 0; j < temp.length; j++) {

                while (!temp[j].isEmpty()) {


                    arr[index] = temp[j].poll();

                    index++;

                }
            }

        }

    }

}
