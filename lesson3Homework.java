package lesson3;

import java.util.Arrays;

public class lesson3Homework {
    public static void main(String[] args) {
//        1
        changedArray();
//        2
        oneHundredArray();
//        3
        doubleTwoArray();
//        4
        twoDimArr();
//        5
        int[] arr = newArray(10, 10);
        System.out.println(Arrays.toString(arr));
//        6
        int minElement = elementMinArray(new int[]{34, 55, 45, 3, 44, 66, 4546});
        System.out.println(minElement + "- это минимальный элемент");
        int maxElement = elementMaxArray(new int[]{34, 55, 45, 3, 44, 66, 4546});
        System.out.println(maxElement + "- это максимальный элемент");
    }

    //   1
    private static void changedArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    //    2
    private static void oneHundredArray() {
        int[] arr = new int[100];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;

        }
        System.out.println(Arrays.toString(arr));
    }

    // 3

    private static void doubleTwoArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = (array[i] * 2);
            }
        }
        System.out.println(Arrays.toString(array));
    }

    //4
    private static void twoDimArr() {
        int[][] table = new int[10][10];
        for (int i = 0; i < table.length; i++) {
            int[] secondLevelArray = table[i];
            for (int j = 0; j < secondLevelArray.length; j++) {
                if (i == j) {
                    table[i][j] = 1;
                }
            }
            }
        for (int i = 0; i < table.length; i++) {
            int[] secondLevelArray = table[i];
            for (int j = 0; j < secondLevelArray.length; j++) {
                if ((i+j) == secondLevelArray.length){
                    table[i][j] = 1;
            }
        }
            System.out.println(Arrays.toString(secondLevelArray));
        }
    }
//    5

    private static int[] newArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    //    6
    private static int elementMinArray(int[] arrayForCheck) {
        int minElement = arrayForCheck[1];
        for (int i = 1; i < arrayForCheck.length; i++) {

            if (arrayForCheck[i] < minElement) {
                minElement = arrayForCheck[i];
            }
        }
        return minElement;
    }

    private static int elementMaxArray(int[] arrayForCheck) {
        int maxElement = arrayForCheck[1];
        for (int i = 1; i < arrayForCheck.length; i++) {
            if (arrayForCheck[i] > maxElement) {
                maxElement = arrayForCheck[i];
            }
        }
        return maxElement;
    }
}


