package oopsexampel;

public class AbstractEx2 {
    static abstract class Employee {
        abstract void calculateSalary();
    }

    static class FullTimeEmployee extends Employee {
        void calculateSalary() {
            System.out.println("Salary: 50000");
        }
    }

    static class PartTimeEmployee extends Employee {
        void calculateSalary() {
            System.out.println("Salary: 20000");
        }
    }
        public static void main(String[] args) {
            Employee e;

            e = new FullTimeEmployee();
            e.calculateSalary();

            e = new PartTimeEmployee();
            e.calculateSalary();
        }
    }

