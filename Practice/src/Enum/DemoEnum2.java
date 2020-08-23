package Enum;

public class DemoEnum2 {
    private enum Season {WINTER, SPRING, SUMMER, FALL}

    private enum Season2 {
        WINTER(10), SPRING(20), SUMMER(30), FALL(40);
        private final int value;
        Season2(int value) {
            this.value = value;
        }
    }

    enum Day {
        SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
    }

    private static void displaySeason() {
        for(Season s: Season.values()){
            System.out.println(s);
        }
        System.out.println("Value of Winter is "+Season.valueOf("WINTER"));
        System.out.println("Index of Winter is "+Season.valueOf("WINTER").ordinal());
        System.out.println("Index of Summer is "+Season.valueOf("SUMMER").ordinal());
    }

    private static void displayWinter() {
        Season s = Season.WINTER;
        System.out.println(s);
    }

    private static void displaySeason2() {
        for(Season2 s: Season2.values()){
            System.out.println(s+" "+s.value);
        }
    }

    private static void displayDay() {
        Day day = Day.FRIDAY;
        switch(day){
            case FRIDAY -> System.out.println("Friday");
            case SATURDAY -> System.out.println("Saturday");
            case SUNDAY -> System.out.println("Sunday");
            case MONDAY -> System.out.println("Monday");
            case TUESDAY -> System.out.println("Tuesday");
            case WEDNESDAY -> System.out.println("Wednesday");
            case THURSDAY -> System.out.println("Thursday");
            default -> System.out.println("Other day");
        }
    }

    public static void main(String... args) {
        displaySeason();
        displayWinter();
        displaySeason2();
        displayDay();
    }
}
