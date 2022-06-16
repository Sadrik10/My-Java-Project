package day25overriding;

public class Cat extends Mammal {

    @Override
    public void feedBabyWithMilk() {
//      super.feedBabyWithMilk();
        System.out.println("Cats feed baby with milk");
    }

    @Override
    public void drink() {
//      super.drink();
        System.out.println("Cats drink");
    }

    public void meow() {
        System.out.println("Cats meow");

    }
}
