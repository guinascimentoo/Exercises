import java.util.Locale;
import java.util.Scanner;

public class multiplos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("São multiplos");
        }
        else{
            System.out.println("Nao sao multiplos");
        }
    }
}