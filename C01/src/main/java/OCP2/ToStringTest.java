package OCP2;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import overridings.Animal;

import static org.apache.commons.lang3.builder.ToStringStyle.*;

/**
 * Created by vitaly on 26.02.16.
 */
public class ToStringTest {

}

class Hippo extends Animal {
    private int weight;

    public Hippo(int id, String name, int weight) {
        super(id, name);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, SHORT_PREFIX_STYLE);
    }

    public static void main(String[] args) {
        System.out.println(new Hippo(1, "Oleg", 150));
    }
}