import java.util.Locale;
import java.util.Scanner;

public class soma {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o valor de Y: ");
        int num2 = sc.nextInt();
        int soma = num1 + num2;
        System.out.println("SOMA = " + soma);
        
    }
}