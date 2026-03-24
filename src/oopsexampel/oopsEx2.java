package oopsexampel;

public class oopsEx2 {
    public static class Student {
        String name;
        int marks;

        void setData(String n, int m) {
            name = n;
            marks = m;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Marks: " + marks);
        }

        public static void main(String[] args) {
            Student s1 = new Student();
            s1.setData("Rahul", 85);
            s1.display();
        }
    }
}
