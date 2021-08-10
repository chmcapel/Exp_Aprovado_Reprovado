package application;

import intities.Student;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student;

        student = new Student();

        student.name = sc.nextLine();

        student.n1 = sc.nextDouble();
        student.n2 = sc.nextDouble();
        student.n3 = sc.nextDouble();

        student.nTotal = student.Calculator();
        student.FastWrite();

        sc.close();
    }
}
