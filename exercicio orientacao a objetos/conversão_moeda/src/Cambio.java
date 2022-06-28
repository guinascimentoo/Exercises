import java.util.Locale;
import java.util.Scanner;
import Cambio.DolarCambio;

public class Cambio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é o preço do dólar? ");
        double preco_Dolar = sc.nextDouble();
        System.out.print("Quantos dólares serão comprados? ");
        double quantia = sc.nextDouble();

        System.out.printf("Valor a ser pago em reais = %.2f%n", DolarCambio.conversao(preco_Dolar,quantia));
        sc.close();
    }
}