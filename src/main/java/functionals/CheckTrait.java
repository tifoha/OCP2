package functionals;

/**
 * Created by vitaly on 03.03.16.
 */
@FunctionalInterface
public interface CheckTrait<T extends Animal> {
    boolean test(T animal);
}
