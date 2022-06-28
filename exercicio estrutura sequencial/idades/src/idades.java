import java.util.Locale;
import java.util.Scanner;

public class idades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Dados da primeira pessoa:");
        System.out.print("Nome: ");
        String nome1 = sc.nextLine();
        System.out.print("Idade: ");
        double idade1 = sc.nextDouble();

        System.out.println("Dados da segunda pessoa:");
        System.out.print("Nome: ");
        sc.nextLine();
        String nome2 = sc.nextLine();
        System.out.print("Idade: ");
        double idade2 = sc.nextDouble();

        double media = (idade1 + idade2) / 2;

        System.out.println("A idade média de " + nome1 + " e " + nome2 + " é de " + media + " anos");
    }
}
