package ua.levelup;

public class StringDemo {

    public static void main(String[] args) {

        String hello = "Hello";
        String substring = hello.substring(4);


        String firstString = "firstString";
        String secondString = "firstString";
        String thirdString = new String("firstString");

//
        System.out.println("firstString == secondString " + (firstString == secondString));
        System.out.println("secondString == thirdString " + (secondString == thirdString));
        System.out.println("firstString == thirdString " + (firstString == thirdString));
//

        String[] hugeArray = new String[] {"Hi", "gg", "fdg", "fgfa", "hgg", "sdfggs", "Hi", "gg", "fdg", "fgfa"};
        String result = "";
        for (String s : hugeArray) {
            result = result + s;

//            result = new StringBuilder().append(s).toString();
        }

        System.out.println(result);

    }
}
