import java.util.Locale;
import java.util.Scanner;

public class soma_impares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int soma = 0;

        if (num1 < num2) {
            for (int i = num1 + 1; i < num2; i++) {
                if (i % 2 != 0) {
                    soma += i;
                }
            }
        } else {
            for (int i= num2 + 1; i < num1; i++) {
                if (i % 2 != 0) {
                    soma += i;
                }
            }
        }
        System.out.println("SOMA DOS IMPARES = " + soma);
    }
}