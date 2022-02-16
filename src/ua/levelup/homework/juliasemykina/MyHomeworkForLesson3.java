package ua.levelup.homework.juliasemykina;

import java.util.Scanner;
import java.util.Arrays;

public class MyHomeworkForLesson3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int arg[] = new int[10];
        System.out.print("Insert 10 array elements:");
        for (int i = 0; i < arg.length; i++) {
            arg[i] = input.nextInt();
        }
        System.out.println();

        System.out.println("Bubble sort");
        boolean isSorted = false;  // sort indicator
        int counter = 0;
        while (!isSorted) {
            counter++;
            isSorted = true;
            for (int i = 0; i < arg.length - counter; i++) {  //compare all elements pairwise
                if (arg[i] > arg[i + 1]){
                    int swap = arg[i]; // exchange places
                    arg[i] = arg[i + 1];
                    arg[i + 1] = swap;
                    isSorted = false;
                }
            }
        }
        System.out.println("Result:" + Arrays.toString(arg));

    }
}
 class SelectionSort {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int arg[] = new int[10];
        System.out.print("Insert 10 array elements:");
        for (int i = 0; i < arg.length; i++) {
            arg[i] = input.nextInt();
        }
        System.out.println();
        System.out.println("Selection sort");

        for(int i = 0; i < arg.length - 1; i++) { // mark  current stage
            int c = i;
            for(int m = c + 1; m < arg.length; m++){ // selection of the minimal element
                if(arg[m] < arg[c]){
                    c = m;
                }
            }

            if(i != c){  // exchange places
                int swap = arg[i];
                arg[i] = arg[c];
                arg[c] = swap;
            }
        }
        System.out.println();

        for(int num:arg){
            System.out.print(num+" ");
        }
    }
}
class JaggedArray {

    public static void main(String[] args)
    {
        int r = 5;

        int mas[][] = new int[r][]; // declaring array with 5 rows

        for (int i = 0; i < mas.length; i++) //creating an array whith 1  element in first row and +1 element till the last row
            mas[i] = new int[i + 1];


        int count = 0;  // Initializing array
        for (int i = 0; i < mas.length; i++)
            for (int j = 0; j < mas[i].length; j++)
                mas[i][j] = count++;


        for (int i = 0; i < mas.length; i++) {  // Displaying the values
            for (int j = 0; j < mas[i].length; j++)
                System.out.print(mas[i][j] + " ");
            System.out.println();
        }
    }
}
