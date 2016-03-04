package functionals;

/**
 * Created by vitaly on 03.03.16.
 */
public class Animal {
    private final String species;
    private final boolean canHop;
    private final boolean canSwim;

    public Animal(String species, boolean canHop, boolean canSwim) {
        this.species = species;
        this.canHop = canHop;
        this.canSwim = canSwim;
    }

    public String getSpecies() {
        return species;
    }

    public boolean isCanHop() {
        return canHop;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    @Override
    public String toString() {
        return ToStringBuilder
    }
}
