package org.example.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {25, 111, 1, 66, 3, 21};
        int len = numbers.length;
        System.out.println("Before " + Arrays.toString(numbers));

        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        for (int outerCtr = 0; outerCtr < len; outerCtr++) {
            for (int inrCtr = 0; inrCtr < len - outerCtr - 1; inrCtr++) {
                if (numbers[inrCtr] > numbers[inrCtr + 1]) {
                    int temp = numbers[inrCtr];
                    numbers[inrCtr] = numbers[inrCtr + 1];
                    numbers[inrCtr + 1] = temp;
                }
            }
        }
        System.out.println("After " + Arrays.toString(numbers));
    }
}
