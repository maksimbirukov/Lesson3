package ua.levelup;

import java.util.ArrayList;
import java.util.List;

public class Loops {

    public static void main(String[] args) {

        ArraysDemo arraysDemo = new ArraysDemo();
        arraysDemo.testArray();

        Loops loops = new Loops();
        //1. while
        loops.whileExample();

        //2. do-while
        loops.doWhileExample();

        //3. for
        forExamples();

        //4. foreach
        foreach();

        //5. return
        returnExample1();
        returnExample2();

        //6. break
        breakExample();

        //7. continue
        continueExample();

        //8. switch
        switchExample("OK");
        switchExample("TEST");
        switchExample("ERROR");
        switchExample("EXCEPTION");
    }

    void whileExample() {
        int i = 10;
        while (i > 0) {
            System.out.println(--i);
        }
    }

    void doWhileExample() {
        int i = 10;
        do {
            System.out.println(i--);
        } while (i > 0);
    }

    static void forExamples() {
        //with all statements
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }


        //with 1 and 2 statements variants
        for (int i = 10; i > 0; ) {
            System.out.println(i--);
            for (int j = 10; j > 0; j--) {
                System.out.println(j);
            }
        }

        //with labels
        labelOut:
        for (int i = 0; i < 10; i++) {
            labelInner:
            for (int j = 0; j < 10; j++) {
                if(j==4) {
                    continue  labelOut;
                }
            }
        }
    }

    static void foreach() {

        List<String> strings = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            strings.add("" + i);
        }

        for (String str : strings) {
            System.out.print(str + ", ");
        }

        System.out.println("");
    }

    static int returnExample2() {
        //and also with return we can return value from method
        //this approach also interrupt iteration
        for (int i = 0; i < 10; i++) {
            if(i==3) {
                return i;
            }
        }

        return 0;
    }

    static void returnExample1() {
        //return is used for interrupt iteration
        for (int i = 0; i < 10; i++) {
            if(i==3) {
                return;
            }
        }
    }

    static void breakExample() {
        //break is used also for interrupt iteration
        for (int i = 0; i < 10; i++) {
            if(i==3) {
                break;
            }
        }

        int i=0;
        //even for infinite iteration)
        //this is only for demonstration how it can be used
        //but please do not write such code in your practice
        while (true) {
            i++;
            if(i > 3) {
                break;
            }
        }
    }

    static void continueExample() {
        //continue is used as it means for continue iteration
        for (int i = 0; i < 10; i++) {
            if(i==3 || i==5) {
                continue;
            }

            //for example if we need to skip some values in iteration
            //continue just tell to "for" loop to continue iteration and next line will never been invoked
            System.out.println(i);
        }
    }

    static void switchExample(String value) {

        switch (value) {
            case "ERROR":
            case "EXCEPTION":
                System.out.println("Something went wrong!");
                break;
            case "OK":
                System.out.println("It is Ok!");
                break;
            default:
                System.out.println("Unknown state");
                break;

        }

        //Here are all possible types we can use in switch statement
        //char, byte, short, int, Character, Byte, Short, Integer, String, or an enum
    }
}
