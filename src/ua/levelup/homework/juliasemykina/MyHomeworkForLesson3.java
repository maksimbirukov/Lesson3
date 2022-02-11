package com.company;

import java.util.Arrays;

public class MyHomeworkForLesson3 {
    public static void main(String[] args) {

        int arg[] = new int[10];

                System.out.format("arg0 = %d, arg1 = %<d, arg2 = %<d, arg3 = %<d, arg4 = %<d, arg5 = %<d, arg6 = %<d, arg7 = %<d, arg8 = %<d, arg9 = %<d%n",
                        arg[0], arg[1], arg[2], arg[3], arg[4], arg[5], arg[6], arg[7], arg[8], arg[9]);



                boolean isSorted = false; // sort indicator
                int swap;
                while (!isSorted) {
                    isSorted = true; //expecting that array has been sorted
                    for (int i = 0; i < arg.length - 1; i++) { //compare all elements pairwise and contained within the confines of array
                        if (arg[i] > arg[i + 1]) {
                            isSorted = false;

                            swap = arg[i];  // exchange places
                            arg[i] = arg[i + 1];
                            arg[i + 1] = swap;
                        }
                    }
                }
                System.out.println(Arrays.toString(arg));
            }
        }



 class SelectionSort {
    public static void main(String[] args) {
        int arg[] = new int[10];

        System.out.format("arg0 = %d, arg1 = %<d, arg2 = %<d, arg3 = %<d, arg4 = %<d, arg5 = %<d, arg6 = %<d, arg7 = %<d, arg8 = %<d, arg9 = %<d%n",
                arg[0], arg[1], arg[2], arg[3], arg[4], arg[5], arg[6], arg[7], arg[8], arg[9]);



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

class Main {
    public static void main(String[] args)
    {
        int r = 5;

        int mas[][] = new int[r][]; // declaring array with 5 rows

        for (int i = 0; i < mas.length; i++) //creating an array whith one  element in first row and +1 element till the last row
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





