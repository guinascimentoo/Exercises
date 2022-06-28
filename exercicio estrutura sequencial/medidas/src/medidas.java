import java.util.Locale;
import java.util.Scanner;

public class medidas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida A: ");
        double medida1 = sc.nextDouble();
        System.out.print("Digite a medida B: ");
        double medida2 = sc.nextDouble();
        System.out.print("Digite a medida C: ");
        double medida3 = sc.nextDouble();

        double quadrado = medida1 * medida1;
        double triangulo = (medida1 * medida2) / 2;
        double trapezio = ((medida1 + medida2) * medida3) / 2;

        System.out.printf("AREA DO QUADRADO %.4f%n", quadrado);
        System.out.printf("AREA DO TRIANGULO %.4f%n", triangulo);
        System.out.printf("AREA DO TRAPEZIO %.4f%n", trapezio);

    }
}
