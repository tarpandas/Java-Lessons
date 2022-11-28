// We cannot create the object of abstract class
// If a child does not implement all the abstract methods of abstract parent class, 
// then the child class must need to be declared abstract as well.
abstract class Animal {
    int a = 23;
    abstract void sound();
    // abstract void hear();
    void eat() {
        System.out.println("Is eating!");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow!");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bhow!");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Cat catObj = new Cat();
        Dog dogObj = new Dog();

        catObj.sound();
        System.out.println(catObj.a);
        catObj.eat();
        dogObj.sound();
        catObj.eat();
    }
}
