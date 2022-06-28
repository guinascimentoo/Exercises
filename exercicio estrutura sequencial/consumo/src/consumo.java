import java.util.Locale;
import java.util.Scanner;

public class consumo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Distancia percorrida em Km: ");
        int distancia = sc.nextInt();
        System.out.print("Combustível gasto: ");
        double combustivel = sc.nextDouble();

        double consumido = distancia / combustivel;

        System.out.printf("Consumo medio = %.3f%n", consumido);
    }
}
