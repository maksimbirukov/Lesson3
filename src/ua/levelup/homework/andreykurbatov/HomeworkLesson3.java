package ua.levelup.homework.andreykurbatov;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkLesson3 {

    public static void main(String[] args) {
        bubbleSort();
        selectionSort();
        stairsArray();
    }

    public static void bubbleSort(){
        System.out.println("Bubble sort");
        int[] arr = numbersInput();
        boolean sorted = false;
        int counter = 0;
        while (!sorted) {
            counter++;
            sorted = true;
            for (int i = 0; i < arr.length - counter; i++) {

                if (arr[i] > arr[i + 1]){
                    int buff = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buff;
                    sorted = false;
                }
            }
        }
        System.out.println("Результат:" + Arrays.toString(arr));
    }

    public static void selectionSort(){
        System.out.println("Selection sort");
        int[] arr = numbersInput();
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] <= arr[minIndex]){
                    minIndex = j;
                }
            }
            int buff = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = buff;
        }
        System.out.println("Результат:" + Arrays.toString(arr));
    }

    public static void stairsArray(){
        System.out.println("\nСтупенчатый массив:");
        int[][] array = new int[5][];

        for (int i = 0; i < array.length; i++) {
            array[i] = new int[i+1];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = j + 1;
            }
        }
        System.out.println(Arrays.deepToString(array));
    }

    private static int[] numbersInput(){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Чисел осталось ввести: " + (arr.length - i) + "\n Введите число:");
            arr[i] = scan.nextInt();
        }
        return arr;
    }

}
