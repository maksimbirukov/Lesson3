package ua.levelup;

public class ArraysDemo {

    public static void main(String... args) {
//        String arg = args[0];
//        if("-".equals(arg)) {
//            String version = args[1];
//            if("version".equals(version)) {
//                String number = args[2];
//                System.out.println("version is " + Integer.parseInt(number));
//            }
//        }
//        System.out.format("arg0 = %s, arg1 = %s, arg2 = %s%n", args[0], args[1], args[2]);

//        int n = 300;
//        int[] intArr = new int[n];
//
//        while (n > 0) {
//            intArr[n - 1] = n--;
//        }


//        Object[] objArr = new Object[2];
//        double[] doubles = new double[20];
//
//        int[] intWithDefault = new int[]{1, 2, 3, 4, 5, 7};
//        int[] annon = {1, 2, 3, 4, 5, 7};
//
        int[][] intMatrix = new int[5][5];
        int counter =0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                intMatrix[i][j] = counter++;
            }
        }

        System.out.println();
//        int[][] intMatrix2 = new int[5][];

    }

    public void testArray() {

    }
}
