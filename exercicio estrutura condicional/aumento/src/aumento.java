import java.util.Locale;
import java.util.Scanner;

public class aumento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario da pessoa: ");
        double salarioAtual = sc.nextDouble();

        if(salarioAtual <= 1000.00){
            double novoSalario = (salarioAtual * 0.20) + salarioAtual;
            System.out.printf("Novo salario = R$ %.2f%n", novoSalario);
            double aumento = novoSalario - salarioAtual;
            System.out.printf("Aumento = R$ %.2f%n", aumento);
            double porcentagem = 0.20 * 100;
            System.out.print("Porcentagem = " + porcentagem + " %");
        }
        else if(salarioAtual > 1000.00 && salarioAtual <= 3000.00){
            double novoSalario = (salarioAtual * 0.15) + salarioAtual;
            System.out.printf("Novo salario = R$ %.2f%n", novoSalario);
            double aumento = novoSalario - salarioAtual;
            System.out.printf("Aumento = R$ %.2f%n", aumento);
            double porcentagem = 0.15 * 100;
            System.out.print("Porcentagem = " + porcentagem + " %");
        }
        else if(salarioAtual > 3000.00 && salarioAtual <= 8000.00){
            double novoSalario = (salarioAtual * 0.10) + salarioAtual;
            System.out.printf("Novo salario = R$ %.2f%n", novoSalario);
            double aumento = novoSalario - salarioAtual;
            System.out.printf("Aumento = R$ %.2f%n", aumento);
            double porcentagem = 0.10 * 100;
            System.out.print("Porcentagem = " + porcentagem + " %");
        }
        else{
            double novoSalario = (salarioAtual * 0.05) + salarioAtual;
            System.out.printf("Novo salario = R$ %.2f%n", novoSalario);
            double aumento = novoSalario - salarioAtual;
            System.out.printf("Aumento = R$ %.2f%n", aumento);
            double porcentagem = 0.05 * 100;
            System.out.print("Porcentagem = " + porcentagem + " %");
        }
    }
}