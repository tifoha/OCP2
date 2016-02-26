package overridings;

/**
 * Created by vitaly on 25.02.16.
 */
public abstract class Animal {
    public int id;
    public String name = "???";

    public Animal() {
    }

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Lion leo = new Lion();
        Animal leo2 = leo;
        System.out.println(leo.getName()); //???
        System.out.println(leo.name); //Leo
        System.out.println(leo2.getName()); //???
        System.out.println(leo2.name); //???
    }
}

class Lion extends Animal {
    String name = "Leo";

    public Lion() {
    }

    public Lion(int id, String name) {
        super(id, name);
    }
}