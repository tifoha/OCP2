package OCP2;

import java.util.Objects;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Printer printer = o -> System.out.println(Objects.toString(o));
        printer.print("Hello world!");


    }

}


interface Printer {
     void print(Object o);
//     void print1();

}

interface Test2 {
    void test();

}