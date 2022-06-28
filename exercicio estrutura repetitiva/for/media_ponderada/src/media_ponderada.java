import java.util.Locale;
import java.util.Scanner;

public class media_ponderada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos casos voce vai digitar? ");
        int num = sc.nextInt();

        for(int i=0; i<num; i++){
            System.out.println("Digite tres numeros: ");
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            double num3 = sc.nextDouble();

            double media = ((num1 * 2) + (num2 * 3) + (num3 * 5)) / 10;

            System.out.printf("MEDIA = %.1f%n", media);
        }
    }
}