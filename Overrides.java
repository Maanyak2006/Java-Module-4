public class Overrides {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound(); // Calls parent class method
        
        Dog d = new Dog();
        d.sound(); // Calls child class overridden method
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
