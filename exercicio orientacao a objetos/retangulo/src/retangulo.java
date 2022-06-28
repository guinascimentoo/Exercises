import medidas_retangulo.medidas;

import java.util.Locale;
import java.util.Scanner;

public class retangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        medidas med = new medidas();

        System.out.println("Insira a largura e a altura do retângulo");
        System.out.print("Largura: ");
        med.largura = sc.nextDouble();
        System.out.print("Altura: ");
        med.altura = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", med.area());
        System.out.printf("PERIMETRO = %.2f%n", med.perimetro());
        System.out.printf("DIAGONAL = %.2f%n", med.diagonal());
    }
}