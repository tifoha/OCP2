package cat.species;

import cat.BigCat;

/**
 * Created by vitaly on 23.02.16.
 */
public class Lynx extends BigCat{
    public boolean isHasFur() {
        String s = bride;
        return hasFur;
    }
    public static void main(String[] args) {
        BigCat cat = new BigCat();
        System.out.println(cat.name);
//        System.out.println(cat.hasFur);
//        System.out.println(cat.hasPaws);
//        System.out.println(cat.id);
        System.out.println(bride);
    }
}

class Mouse {
    public static void main(String[] args) {
        BigCat cat = new BigCat();
        System.out.println(cat.name);
//        System.out.println(cat.hasFur);
//        System.out.println(cat.hasPaws);
//        System.out.println(cat.id);
//        System.out.println(cat.bride);
    }
}