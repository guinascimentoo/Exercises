import java.util.Locale;
import java.util.Scanner;

public class sequencia_impares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int x = sc.nextInt();

        for(int i=1; i<=x; i+=2){
            System.out.println(i);
        }
    }
}