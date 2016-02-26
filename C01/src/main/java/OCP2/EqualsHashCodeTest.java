package OCP2;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import overridings.Animal;

/**
 * Created by vitaly on 26.02.16.
 */
public class EqualsHashCodeTest {
    private static class Hippo extends Animal {
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
        public int hashCode() {
            return new HashCodeBuilder()
                    .append(id)
                    .hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Hippo)) {
                return false;
            }
            Hippo that = (Hippo) obj;

            return new EqualsBuilder()
                    .appendSuper(super.equals(obj))
                    .append(this.id, that.id)
                    .append(this.name, that.name)
                    .isEquals();
        }

    }

    public static void main(String[] args) {

    }
}
