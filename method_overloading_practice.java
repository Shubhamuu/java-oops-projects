class method_overloading_practice
{
    public static void main(String[] args) {
      Pig pig = new Pig();
      Dog dog = new Dog();
      pig.animalSound();
      dog.animalSound();
        
    }
}

class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}
//sub class, 

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: oink oink");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}
