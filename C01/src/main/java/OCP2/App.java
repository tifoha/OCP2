package OCP2;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(Integer.valueOf(5) == Integer.valueOf(5));
    }

}

interface A {
//    default void foo() {}
void foo();
}
interface B {
    default void foo() {}
}

interface C extends A,B {
    void foo();
//    default void foo() {}
}
