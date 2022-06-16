package day25overriding;

public class Dog extends Mammal{

    @Override   // This is Annotation and checks the Overriding rules.
                // If you do any mistake in Overriding, you will get Compile Time Error
    public void eat() {
//      super.eat();   // It is possible
        System.out.println("Dogs eat");
    }
//    @Override
//    public void drink() {
//      super.drink();
//        System.out.println("Dogs drink");
//    }
    public void bark() {
        System.out.println("Dogs bark");

    }
}
