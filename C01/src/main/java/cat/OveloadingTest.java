package cat;

/**
 * Created by vitaly on 25.02.16.
 */
public class OveloadingTest {
    public static void foo(Integer var) {System.out.println("OveloadingTest.foo(Integer)");}
//    public static void foo(Long var) {System.out.println("OveloadingTest.foo(Long)");}
    public static void foo(int var) {System.out.println("OveloadingTest.foo(int)");}
    public static void foo(long var) {System.out.println("OveloadingTest.foo(long)");}
    public static void foo(int...vars) {System.out.println("OveloadingTest.foo(int...)");}
    public static void foo(Number var) {System.out.println("OveloadingTest.foo(Number)");}

    public static void main(String[] args) {
        foo(new Long(4));
    }
}
