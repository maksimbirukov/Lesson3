package ua.levelup.homework.annachymshyt;

import java.util.Scanner;

public class HomeworkLesson3_AnnaC {

    // function to print the array
    static void printArray(int array[])
    {
        for (int i=0; i<array.length; i++) System.out.print(array[i] + " ");
        System.out.println();
    }

    // function to fill the array with user input
    static int [] fillArray(int n, Scanner sc)
    {
        int array[] = new int[n];
        for (int i=0; i<n; ++i) {
            System.out.println("Enter a new array element: ");
            array[i] = sc.nextInt();
        }
        return array;
    }

    //bubble sort function
    static void bubbleSort(int array[]) {
        int n = array.length;
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }

            }
        }
    }

    //selection sort function
    static void selectionSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
    }


    public static void main(String[] args) {
/*______________________________________________________________*\
*                                                                *
*              B  U  B  B  L  E     S  O  R  T                   *
 *_______________________________________________________________*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of elements in the first array (less than 10): ");
        int length = input.nextInt();

        int array[] = fillArray(length, input);

        System.out.println();
        System.out.println("Unsorted array: ");
        printArray(array);
        selectionSort(array);

        System.out.println("Bubble sorted array: ");
        printArray(array);
        System.out.println();

/*______________________________________________________________*\
*                                                                *
*          S  E  L  E  C  T  I  O  N     S  O  R  T              *
*_______________________________________________________________*/
        System.out.println("Enter a number of elements in the second array (less than 10): ");
        int len = input.nextInt();

        int arr[] = fillArray(len, input);

        System.out.println();
        System.out.println("Unsorted array: ");
        printArray(arr);

        //selection sorting
        selectionSort(arr);

        System.out.println("Selection sorted array: ");
        printArray(arr);

/*______________________________________________________________*\
*                                                                *
*              J  A  G  G  E  D     A  R  R  A  Y                *
*_______________________________________________________________*/

        System.out.println();
        System.out.println("Jagged array: ");
        int ladder[][] = new int[5][];
        int cnt = 1;
        for (int i = 0; i < 5; i++)
        {
            int step[] = new int[i+1];
            for (int j = 0; j < step.length; j++)
            {
                step[j] = cnt++;
                System.out.print(step[j] + " ");
            }
            System.out.println();
        }

    }

}





