import java.util.Locale;
import java.util.Scanner;

public class divisao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos casos voce vai digitar? ");
        int num = sc.nextInt();

        for(int i=0; i<num; i++){
            System.out.print("Entre com o numerador: ");
            double numerador = sc.nextDouble();
            System.out.print("Entre com o denominador: ");
            double denominador = sc.nextDouble();

            System.out.printf((denominador == 0) ? "DIVISAO IMPOSSIVEL\n" : "DIVISAO = %.2f%n", numerador / denominador, "\n");
        }
    }
}