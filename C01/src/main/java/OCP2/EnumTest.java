package OCP2;


import static OCP2.EnumTest.Season.ExpectedVisitors.*;

/**
 * Created by vitaly on 26.02.16.
 */
public class EnumTest {
    public enum Season {
        WINTER(LOW) { @Override void printHours() { System.out.println("9am-pm3"); }},
        SPRING(LOW) { @Override void printHours() { System.out.println("9am-pm5"); } },
        AUTUMN(HIGH) { @Override void printHours() { System.out.println("9am-pm5"); } },
        SUMMER(MEDIUM) { @Override void printHours() { System.out.println("9am-pm7"); } };

        private final ExpectedVisitors expectedVisitors;

        public enum ExpectedVisitors {
            LOW, MEDIUM, HIGH
        }

        Season(ExpectedVisitors expectedVisitors) {
            this.expectedVisitors = expectedVisitors;
        }

        public ExpectedVisitors getExpectedVisitors() {
            return expectedVisitors;
        }

        abstract void printHours();
    }

    public static void main(String[] args) {
        Season season = Season.values()[0];
        switch (season) {
            case WINTER:
                System.out.println(season);
                break;
            case SPRING:
                System.out.println(season);
                break;
            case AUTUMN:
                System.out.println(season);
                break;
            case SUMMER:
                System.out.println(season);
                break;
            default:
                System.out.println("ХЗ :/");
        }
    }
}
