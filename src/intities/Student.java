package intities;

public class Student {

    public String name;
    public double n1;
    public double n2;
    public double n3;
    public double nTotal;

    public double Calculator() {
        nTotal = (n1 + n2 + n3);
        return nTotal;
    }

    public void FastWrite() {
        if (nTotal >= 60) {
            System.out.printf("FINAL GRADE = %.2f%n", nTotal);
            System.out.println("PASS");
        } else {
            System.out.printf("FINAL GRADE = %.2f%n", nTotal);
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f", (60 - nTotal));
            System.out.print(" POINTS");

        }
    }
}
