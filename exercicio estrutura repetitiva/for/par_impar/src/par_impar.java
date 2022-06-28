import java.util.Locale;
import java.util.Scanner;

public class par_impar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int x = sc.nextInt();

        for(int i=0; i<x; i++){
            System.out.print("Digite um numero: ");
            int num = sc.nextInt();

            if(num > 0)
                System.out.println((num % 2 > 0) ? "IMPAR POSITIVO" : "PAR POSITIVO");

            else if(num < 0)
                System.out.println((num % 2 < 0) ? "IMPAR NEGATIVO" : "PAR NEGATIVO");

            else
                System.out.println("NULO");
        }
    }
}