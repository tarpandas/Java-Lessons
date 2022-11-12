class Animal1 {
    int iLegs = 4;
    int iEars = 2;
    void eat() {
        System.out.println("...is eating.");
    }
}

class Dog1 extends Animal1{
    void sound() {
        System.out.println("...is barking.");
    }
}

class Cat1 extends Animal1{
    void sound() {
        System.out.println("...is purring.");
    }
}

class HierarchicalInheritence{
    public static void main(String[] args) {
        Dog1 obj1 = new Dog1();
        obj1.sound();
        obj1.eat();
        System.out.println(obj1.iEars);
        System.out.println(obj1.iLegs);

        Cat1 obj2 = new Cat1();
        obj2.sound();
        obj2.eat();
        System.out.println(obj2.iEars);
        System.out.println(obj2.iLegs);
    }
}