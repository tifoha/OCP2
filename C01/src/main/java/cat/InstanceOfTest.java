package cat;

import java.util.Date;
import java.util.function.Function;

/**
 * Created by vitaly on 25.02.16.
 */
public class InstanceOfTest {
    public static void main(String[] args) {
        String s = "";
        System.out.println(null instanceof Object);
//        System.out.println("" instanceof Integer); // noe compile
        System.out.println(new Date() instanceof Function);
    }
}
