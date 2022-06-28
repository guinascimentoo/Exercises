import java.util.Locale;
import java.util.Scanner;

public class menorDeTres {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        int num1 = sc.nextInt();
        System.out.print("Segundo valor: ");
        int num2 = sc.nextInt();
        System.out.print("Terceiro valor: ");
        int num3 = sc.nextInt();

        if(num1 < num2 && num1 < num3){
            System.out.println("MENOR = " + num1);
        }
        if(num2 < num1 && num2 < num3){
            System.out.println("MENOR = " + num2);
        }
        else{
            System.out.println("MENOR = " + num3);
        }
    }
}