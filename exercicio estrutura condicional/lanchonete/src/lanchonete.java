import java.util.Locale;
import java.util.Scanner;

public class lanchonete {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double produto1 = 5.00;
        double produto2 = 3.50;
        double produto3 = 4.80;
        double produto4 = 8.90;
        double produto5 = 7.32;

        System.out.print("Codigo do produto comprado: ");
        int codProduto = sc.nextInt();
        System.out.print("Quantidade comprada: ");
        int quantComprada = sc.nextInt();

        if(codProduto == 1){
            double precoTotal = produto1 * quantComprada;
            System.out.printf("Valor a pagar: R$ %.2f%n", precoTotal);
        }
        else if(codProduto == 2){
            double precoTotal = produto2 * quantComprada;
            System.out.printf("Valor a pagar: R$ %.2f%n", precoTotal);
        }
        else if(codProduto == 3){
            double precoTotal = produto3 * quantComprada;
            System.out.printf("Valor a pagar: R$ %.2f%n", precoTotal);
        }
        else if(codProduto == 4){
            double precoTotal = produto4 * quantComprada;
            System.out.printf("Valor a pagar: R$ %.2f%n", precoTotal);
        }
        else if(codProduto == 5){
            double precoTotal = produto5 * quantComprada;
            System.out.printf("Valor a pagar: R$ %.2f%n", precoTotal);
        }
    }
}