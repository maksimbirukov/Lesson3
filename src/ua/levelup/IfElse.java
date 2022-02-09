package ua.levelup;

import java.util.Scanner;

import static java.lang.System.out;

public class IfElse {

    public static void main(String[] args) {
        // 1 if else

        Scanner scanner = new Scanner(System.in);

        out.print("Enter a number: ");
        doProcessInput(scanner.nextInt());


        //2. if-else if

        int i =9;

        if (i < 10) {
            out.println("your number is less than 10");
        } else if (i > 10) {
            out.println("your number is more than 10");
        } else {
            out.println("your number is 10");
        }
    }

    static void doProcessInput(int i) {
        if (i != 10) {
            out.println("your number is not equals to 10");
        } else {
            out.println("your number is 10");
        }
    }
}
