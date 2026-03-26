package oopsexampel;

public class InheritanceEx2 {
    public static class Shape {
        void draw() {
            System.out.println("Drawing shape");
        }
    }

    public static class Circle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing circle");
        }
    }

        public static void main(String[] args) {
            Circle c = new Circle();
            c.draw();
        }
    }

