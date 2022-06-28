import java.util.Locale;
import java.util.Scanner;

public class crescente {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println((num1 > num2) ? "DECRESCENTE" : "CRESCENTE");

        while(num1 != num2){

            System.out.println("Digite outros dois numeros: ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();

            System.out.println((num1 > num2) ? "DECRESCENTE!" : "CRESCENTE!");
        }
    }
}