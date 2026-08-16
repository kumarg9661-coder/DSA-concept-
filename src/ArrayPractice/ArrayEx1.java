package ArrayPractice;

import java.util.Scanner;

public class ArrayEx1 {
    public static void main(String[] args) {
        int marks[] = new int[50];

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();//math
        marks[1] = sc.nextInt();//chem
        marks[2] = sc.nextInt();//phy

        System.out.println("math : "+ marks[0]);
        System.out.println("chem : "+ marks[1]);
        System.out.println("phy : "+marks[2]);

        marks[1] = 98; // update marks
        System.out.println("math : "+marks[1]);
    }
}
