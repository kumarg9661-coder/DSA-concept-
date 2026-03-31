package oopsexampel;
import java.util.Scanner;

public class Student {

     static class Studentone {
        String name;
        int marks;

        // Constructor
        Studentone(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        // Grade method
        void calculateGrade() {
            if (marks >= 90) {
                System.out.println(name + " Grade: A");
            } else if (marks >= 75) {
                System.out.println(name + " Grade: B");
            } else if (marks >= 50) {
                System.out.println(name + " Grade: C");
            } else {
                System.out.println(name + " Grade: Fail");
            }
        }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            Studentone s1 = new Studentone(name, marks);
            s1.calculateGrade();

            sc.close();
        }
    }


