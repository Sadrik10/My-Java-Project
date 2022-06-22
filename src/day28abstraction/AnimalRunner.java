package day28abstraction;

public class AnimalRunner {

    public static void main(String[] args) {

        Animal animal1 = new Cat("meow","Shero");

        animal1.animalSound();  // Sound of animal is meow
        animal1.animalName();   // Name of animal is Shero

        System.out.println("======================");

        Animal animal2 = new Sheep("meee","Shaun");
        animal2.animalName();   // animal name is Shaun
        animal2.animalSound();  // animal sound is meee

        System.out.println("======================");

        Sheep sheep = new Sheep("baa","Dolly");
        System.out.println(sheep.name);  // Dolly
        System.out.println(sheep.sound); // baa
        sheep.animalName();  // animal name is Dolly
        sheep.animalSound(); // animal sound is baa
    }
}
