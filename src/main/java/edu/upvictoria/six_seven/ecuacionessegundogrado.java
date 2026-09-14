package edu.upvictoria.six_seven;

public class ecuacionessegundogrado {

    public static void resolver(double a, double b, double c) {

        if (a == 0){
            System.out.println("El valor de a no puede ser 0.");
            return;
        }

        double discriminante = (b * b) - (4 * a * c);

        if (discriminante > 0) {

            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            System.out.println("La ecuacion tiene dos soluciones:");
            System.out.println("x1 = " + x1);

            System.out.println("x2 = " + x2);

        } else if (discriminante == 0) {

            double x = -b / (2 * a);

            System.out.println("La ecuacion tiene una solucion:");
            System.out.println("x = " + x);

        } else {

            System.out.println("La ecuacion no tiene solucion");
        }
    }
}
