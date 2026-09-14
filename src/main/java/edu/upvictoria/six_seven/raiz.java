package edu.upvictoria.six_seven;
import java.util.Scanner;

public class raiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();

        double discriminante = (b * b) - (4 * a * c);

        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            System.out.println("Sin raíces reales.");
        }

        sc.close();
    }
}