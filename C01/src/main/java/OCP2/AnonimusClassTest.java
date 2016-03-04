package OCP2;


import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by vitaly on 01.03.16.
 */
public class AnonimusClassTest {
    private interface C extends Function, Supplier {

    }
    public static void main(String[] args) {

        int one = 4;
        Random r = new Random();
//        if (one==5) {
//            one=6;
//        }

        Function a = new C() {
            @Override
            public Object get() {
                return null;
            }

            @Override
            public Object apply(Object o) {
                return null;
            }
        };
    }
}
