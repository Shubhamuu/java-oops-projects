public class constructorcall {
    public static void main(String[] args) {
        Dog ob1 = new Dog("Buddy", 3);
    }
}
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {
    int age;

    Dog(String name, int age) {
        super(name);  // Call the constructor of the superclass (Animal)
        this.age = age;
        System.out.println("Dog constructor");
    }
}




