class Animal {
    int iLegs = 4;
    int iEars = 2;
    void eat() {
        System.out.println("...is eating.");
    }
}

class Dog extends Animal{
    void sound() {
        System.out.println("...is barking.");
    }
}

class SingleInheritence{
    public static void main(String[] args) {
        Dog obj1 = new Dog();
        obj1.sound();
        obj1.eat();
        System.out.println(obj1.iEars);
        System.out.println(obj1.iLegs);
    }
}