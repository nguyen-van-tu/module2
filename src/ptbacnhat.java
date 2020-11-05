import java.util.Scanner;

public class ptbacnhat {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        double a, b, c;
        System.out.println("a :");
        a = ac.nextDouble();
        System.out.println("b :");
        b = ac.nextDouble();
        System.out.println("c :");
        c = ac.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == 0) {
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution!");
            }

        }
    }
}
