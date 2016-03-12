package OCP2;

/**
 * Created by vitaly on 09.03.16.
 */
public class Generic<T> {
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T recent(T t) {
        return t;
    }

    public static void main(String[] args) {
        class A { }
        class B extends A { }
        class C extends B { }

//        Generic<? extends Number> g = new Generic<>();
//        g.setValue((Number) new Long(5));
//        Number v = g.getValue();
//        v = g.recent(v);
    }
}
