package functionals;

import java.util.Arrays;
import java.util.List;

/**
 * Created by vitaly on 03.03.16.
 */
public class FindMatchingAnimals {
    private static void print(Animal animal, CheckTrait<Animal> checkTrait) {
        if (checkTrait.test(animal)) {
            System.out.println(animal);
        }
    }
    public static void main(String[] args) {
        List<Animal> animalList = Arrays.asList(
                new Animal("fish", false, true),
                new Animal("kangaroo", true, false)
        );

        animalList.forEach(animal -> print(animal, a -> a.isCanHop()));
    }
}
