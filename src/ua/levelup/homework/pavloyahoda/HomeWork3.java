package ua.levelup.homework.pavloyahoda;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.exit;
// Блок меню я взял из Инета и отредакировал под себя. Эта часть требует отдельного разбора, что и как
public class HomeWork3 {
    public static void printMenu(String[] options){
        for (String option : options){
            System.out.println(option);
        }
        System.out.print("Выберите пункт меню: ");
    }
    private static String[] options = {"1 - Пузырьковая сортировка",
            "2 - Сортировка выборкой",
            "3 - Ступенчатый массив",
            "4 - Exit"
    };
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        while (option != 5) {
            printMenu(options);
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Введите размерность массива (не более 10):");
                    Scanner sc1 = new Scanner(System.in); //create scanner
                    int n = sc1.nextInt(); // set array size to var "n"
                    int[] myArr1 = new int[n]; // create array "myArr" with size "n"
                    System.out.println("Введите целые числа в случайном порядке:");
                    for (int i = 0; i < n; i++) {
                        myArr1[i] = sc1.nextInt(); // fill array with elements
                    }
                    System.out.printf("Массив создан: %n" + Arrays.toString(myArr1) + "%n");
                    System.out.println("Упорядочим числа в нем по возрастанию методом Bubble Sort:");

                    int counter; // создаем счетчик для отслеживания перестановок в массиве
                    do {
                        counter = 0; //обнуляем счетчик, иначе не выйдет из цикла
                        for (int i = 0; i < n - 1; i++) {
                            if (myArr1[i] > myArr1[i + 1]) { //сравниваем рядом стоящие значения
                                int a = myArr1[i + 1]; // вводим буферную переменную и присваиваем ей меньшее значение
                                myArr1[i + 1] = myArr1[i]; //второму числу присваиваем большее значение
                                myArr1[i] = a; //первому числу присваиваем меньшее значение
                                System.out.println(Arrays.toString(myArr1));
                                counter = ++counter; //если не 0, то цикл повторяется.
                            }
                        }
                    } while (counter > 0); //если 0, то цикл останавливается
                    break;
                case 2:
                    System.out.println("Введите размерность массива (не более 10):");
                    Scanner sc2 = new Scanner(System.in); //create scanner 2
                    int m = sc2.nextInt(); // set array size to var "m"
                    int[] myArr2 = new int[m]; // create array "myArr" with size "m"
                    System.out.println("Введите целые числа в случайном порядке:");
                    for (int i = 0; i < m; i++) {
                        myArr2[i] = sc2.nextInt(); // fill array with elements
                    }
                    System.out.printf("Массив создан: %n" + Arrays.toString(myArr2) + "%n");
                    System.out.println("Упорядочим числа в нем по возрастанию методом Selection Sort:");
                    for (int i = 0; i < m - 1; i++) { //нужно найти индекс минимального элемента
                        int min = i; // вводим переменную и присваеваем ей значение индекса, на каждом круге будем начинать со следующего по порядку элемента
                        for (int k = i + 1; k < m; k++) { //переменной присваиваем значение следующего по порядку индекса
                            if (myArr2[k] < myArr2[min]) { //сравниваем значения
                                min = k; // если условие выполнилось, то обновляем индекс минимального элемента.
                            }
                        }
                        if (i != min) { // если на каждом круге минимальный элемент не стоит в крайней левой позиции, то
                            int b = myArr2[i]; //вводим буферную переменную и присваиваем ей значение i-го элемента.
                            myArr2[i] = myArr2[min]; // i-му элементу присваиваем значение минимального и
                            myArr2[min] = b; // меняем их местами
                        }
                    }
                    System.out.println(Arrays.toString(myArr2));
                    break;
                case 3:
                    int[][] myArr3 = new int[5][]; //создаем новый двумерный массив, у которого будет 5 строк. Количество столбцов в строках не указываем
                    int count = 1; //создаем счетчик значений элементов для заполнения от 1 до n;
                    for (int i = 0; i < 5; i++) { //цикл для создания ступенчатой структуры массива с заполнением значениями
                        myArr3[i] = new int[i + 1]; //создаем новую строку
                        for (int j = 0; j <= i; j++) { //цикл для заполнения значениями
                            myArr3[i][j] = count++; //каждому элементу присваиваем следующее значение
                        }
                        System.out.println(Arrays.toString(myArr3[i])); //выводим на печать каждую строку отдельно
                    }
                    break;
                case 4:
                    exit(0);
            }

        }
    }
}

