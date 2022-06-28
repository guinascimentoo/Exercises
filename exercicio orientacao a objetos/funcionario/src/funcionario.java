import func.Salario;

import java.util.Locale;
import java.util.Scanner;

public class funcionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Salario salario = new Salario();

        System.out.print("Name: ");
        salario.nome = sc.nextLine();
        System.out.print("Salario bruto: ");
        salario.salarioBruto = sc.nextDouble();
        System.out.print("Taxa: ");
        salario.taxa = sc.nextDouble();

        System.out.println("Funcionário " + salario);

        System.out.print("Qual porcentagem para aumentar o salário? ");
        double porcentagem = sc.nextDouble();
        salario.aumentarSalario(porcentagem);

        System.out.println("Dados atualizados: " + salario);
    }
}