package ua.levelup;

import java.util.Arrays;



public class EnumDemo {

    public static void main(String[] args) {
        SIZE MEDIUM = SIZE.MEDIUM;
        SIZE SMALL = SIZE.SMALL;
        System.out.println(SIZE.MEDIUM);
        System.out.println(MEDIUM);

        System.out.println(DAYS_OF_WEEK.FRIDAY);

        // values
        DAYS_OF_WEEK[] values = DAYS_OF_WEEK.values();
        System.out.println(Arrays.toString(values));

        //ordinal
        System.out.println(DAYS_OF_WEEK.MONDAY.ordinal());
        System.out.println(DAYS_OF_WEEK.SUNDAY.ordinal());

        //name
        System.out.println(DAYS_OF_WEEK.MONDAY.name());
        System.out.println(DAYS_OF_WEEK.SUNDAY.name());

        //valueOf
        System.out.println(DAYS_OF_WEEK.valueOf("SATURDAY"));
    }

    //имя для ENUM записывается прописными буквами
    enum SIZE {
        SMALL,
        MEDIUM,
        LARGE,
        EXTRA_LARGE}

    enum DAYS_OF_WEEK {

        MONDAY("Понедельник"),
        TUESDAY("Вторник"),
        WEDNESDAY("Среда"),
        THURSDAY("Четверг"),
        FRIDAY("Пятница"),
        SATURDAY("Суббота"),
        SUNDAY("Воскресенье");

        private String day;

        DAYS_OF_WEEK(String day) {
            this.day = day;
        }

        @Override
        public String toString() {
            return "DAYS_OF_WEEK{" +
                    "day='" + day + '\'' +
                    '}';
        }
    }

}
