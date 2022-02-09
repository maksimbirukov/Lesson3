package ua.levelup;

public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        StringBuilder append = builder.append(34).append("Hello").append('T');

        String name = "Hello";
        String str = 34 + name + "T";

        String[] hugeArray = new String[] {"Hi", "gg", "fdg", "fgfa", "hgg", "sdfggs", "Hi", "gg", "fdg", "fgfa"};
        StringBuilder sb = new StringBuilder();
        for (String s : hugeArray) {
            sb.append(s);
        }

        System.out.println(sb);


    }
}
