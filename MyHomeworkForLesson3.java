package ua.levelup.homework.savchenkodmitriu;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Домашнее задание №3
 * @version 1.8
 * @author Savcheko Dmitriy
 */
public class MyHomeworkForLesson3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//Ввод значений элементов массива для сортировки
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Введите " + (i + 1) + " значение элемента массива");
            a[i] = in.nextInt();
        }
        System.out.println("Введенные элементы массива до сортировки");
        System.out.println(Arrays.toString(a));
        System.out.println("Сортировка способом BubbleSort");
        bubbleSort(a);//Выполнение метода bubbleSort
        System.out.println(Arrays.toString(a));
        System.out.println("Сортировка способом Selection Sort");
        selectionSort(a);//Выполнение метода selectionSort
        System.out.println(Arrays.toString(a));
        int [][] ja=new int[5][];//Зубчатый массив
        for (int j=0; j<5; j++) {//Выбор строк для заполнения
            ja[j]=new int[j+1];
            for (int k=0; k<=j; k++) {//Заполнения строк значениями
                ja[j][k]=k+1;
            }
        }
        System.out.println("Зубчатый массив:");
        System.out.println(Arrays.deepToString(ja));

    }

    public static void bubbleSort(int[] bs) {// Сортировка Bubble Sort
        int i, t;
        boolean step = true;//Лог. перем. истинности замены элементов за проход
        while (step) {//Цикл прохода
            step = false;
            for (i = 0; i < bs.length - 1; i++) {//Цикл перебора элементов массива
                if (bs[i] > bs[i + 1]) {//Условие замены местами элементов массива
                    t = bs[i];
                    bs[i] = bs[i + 1];
                    bs[i + 1] = t;
                    step = true;
                }
            }
        }
    }

    public static void selectionSort(int[] ss) {//Сортировка Selection Sort
        for (int i = 0; i < ss.length; i++) {//Цикл номера прохода
            int p = i;
            int min = ss[i];
            for (int j = i + 1; j < ss.length; j++) {//Цикл выбора мин. значения в проходе
                if (ss[j] < min) {
                    p = j;
                    min = ss[j];
                }
            }
            ss[p] = ss[i];
            ss[i] = min;
        }
    }
}


