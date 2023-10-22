package org.example;


public class Main {
    public static void main(String[] args) {
        int[] arr1 = {2, 1, 2, 3, 4};
        int[] arr2 = {2, 2, 0};
        int[] arr3 = {1, 3, 5};

        System.out.println(countEvens(arr1)); // Вывод: 3
        System.out.println(countEvens(arr2)); // Вывод: 3
        System.out.println(countEvens(arr3)); // Вывод: 0

        int[] arr4 = {2, 1, 5, 3, 9};
        System.out.println(findMaxMinDifference(arr4)); // Вывод: 8

        int[] arr5 = {2, 0, 0, 3, 4};
        System.out.println(hasAdjacentZeros(arr5)); // Вывод: true
    }

    public static int countEvens(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static boolean hasAdjacentZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public static int findMaxMinDifference(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }

        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return max - min;
    }
}