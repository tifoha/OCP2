package OCP2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}

class A {
    public static void main(String[] args) {
//        Predicate<Boolean> p = b -> b;
//        A<Integer> a = new A<>();
//        if (a instanceof A<Number>) {}
        List list = new ArrayList<>();
        list.add(5);
        int i = (int) list.get(0);
        System.out.println(i);
        List<?> list1 = new ArrayList<B>();
    }
    public static List<? super B> addRandom(List<? super B> list) {
//        list.add(new A()); //Если сделать List<? extends B> тогда лист будет immutable
        list.add(new B()); //Работает потому что в листе можно хранить потомки B
        return list;
    }

    public static <B extends A> B method3(List<B> list) {
        return list.get(0);
    }
//    public static <B> B method4(List<B extends A> list) { return list.get(0); }//Not compile
}

class B extends A{}

class C extends B{}