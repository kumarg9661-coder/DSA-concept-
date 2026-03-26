package oopsexampel;

public class InheritanceEx3 {
    public static class Person {
        Person(String name) {
            System.out.println("Name: " + name);
        }
    }

    public static class Student extends Person {
        Student(String name) {
            super(name); // calling parent constructor
            System.out.println("Student created");
        }
    }

        public static void main(String[] args) {
            Student s = new Student("Rahul");
        }
    }

