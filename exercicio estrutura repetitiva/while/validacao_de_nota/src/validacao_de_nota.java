import java.util.Locale;
import java.util.Scanner;

public class validacao_de_nota {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        while(nota1 < 0 || nota1 > 10){
            System.out.println("Valor invalido! Tente novamente: ");
            System.out.println("Digite a primeira nota: ");
            nota1 = sc.nextDouble();
        }

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        while(nota2 < 0 || nota2 > 10){
            System.out.println("Valor invalido! Tente novamente: ");
            System.out.println("Digite a segunda nota: ");
            nota2 = sc.nextDouble();
        }
        double media = (nota1 + nota2) / 2;
        System.out.printf("MEDIA = %.2f%n", media);
    }
}