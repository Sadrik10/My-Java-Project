package day22Inheritance;

public class Dog extends Mammals{

    // The class name before the "extends" keyword is the child class. *** For example child class name is Dog.
    // The class name after the "extends" keyword is the parent class. *** For example parent class name is Mammals.

    public void bark(){
        System.out.println("Dogs bark...");
    }
    public Dog(){
        System.out.println("Dog constructor");
    }
}
