public class Dynamic {
    public static void main(String[] args) {
        class Animal {
            void sound() {
                System.out.println("Animal makes a sound");
            }
        }

        Animal a = new Animal(); 
        a.sound();

        class Dog extends Animal {
            void sound() {
                System.out.println("Bark");
            }
        }

        a = new Dog(); 
        a.sound(); 

        class Cat extends Animal {
            void sound() {
                System.out.println("Meow");
            }
        }

        a = new Cat(); 
        a.sound(); 
    }
}
