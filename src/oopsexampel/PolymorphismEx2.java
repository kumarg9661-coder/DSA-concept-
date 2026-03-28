package oopsexampel;

public class PolymorphismEx2{
    public static class Animal {
        void sound() {
            System.out.println("Animal makes sound");
        }
    }

    public static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }

        public static void main(String[] args) {
            Animal obj = new Dog();
            obj.sound();
        }
    }
}
