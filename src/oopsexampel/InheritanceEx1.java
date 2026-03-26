package oopsexampel;

public class InheritanceEx1 {
     public static class Animal {
        void eat() {
            System.out.println("Animal is eating");
        }
    }

     public static class Dog extends Animal {
        void bark() {
            System.out.println("Dog is barking");
        }
    }
        public static void main(String[] args) {
            Dog d = new Dog();
            d.eat();   // inherited method
            d.bark();  // own method
        }
    }

