import java.util.Locale;
import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número da tabuada: ");
        int x = sc.nextInt();
        for(int i=0; i<11; i++){
            int multiplicacao = x * i;
            System.out.println(x + " X " + i + " = " + multiplicacao);
        }
    }
}