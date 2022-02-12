package ua.levelup.homework.aleksandrmikhail;

import java.util.Arrays;
import java.util.Scanner;

public class HW_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr1 = new int[10];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Введите массив");
            arr1[i] = scan.nextInt();

        }
        NewBubbleSort(arr1);
        System.out.println(Arrays.toString(arr1));

       NewSelectionSort(arr1);
        System.out.println(Arrays.toString(arr1));
        NewArray();
       /* System.out.println(Arrays.deepToString(arr3));*/
    }
    static void NewBubbleSort(int [] arr){
        int a = 10;
        int b;
        for (int i = 0;i < a;i++){
            for (int j = 1; j < (a - i);j++){
                if(arr[j-1]>arr[j]){ //swap elements
                    b = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=b;

                }
            }
        }

    }
    static void NewSelectionSort(int [] arr2){
        for (int i = 0;i<arr2.length-1;i++){
            int k = i;
            for (int j=i+1;j<arr2.length;j++){
                if (arr2[j]<arr2[k]){
                    k=j;
                }
            }
            int SmalNum = arr2[k];
            arr2[k]=arr2[i];
            arr2[i]=SmalNum;

        }


    }
    static void NewArray(){
    int [][] arr3 = new int[5][];
    for (int i=0;i<arr3.length;i++){
        arr3[i]=new int[i+1];
        for (int j=0;j<arr3[i].length;j++){
            arr3[i][j]=j+1;
        }
    }
    System.out.println(Arrays.deepToString(arr3));
    }
}