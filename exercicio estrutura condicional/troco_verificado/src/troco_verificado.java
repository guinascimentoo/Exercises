import java.util.Locale;
import java.util.Scanner;

public class troco_verificado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço unitário do produto: ");
        double precoUnitario = sc.nextDouble();
        System.out.print("Quantidade comprada: ");
        int quantComprada = sc.nextInt();
        System.out.print("Dinheiro recebido: ");
        double dinheiroRecebido = sc.nextDouble();

        double precoTotal = precoUnitario * quantComprada;
        double troco = dinheiroRecebido - precoTotal;

        if(dinheiroRecebido > precoTotal){
            System.out.printf("TROCO = %.2f%n", troco);
        }

        if(dinheiroRecebido < precoTotal){
            double dinheiroInsuficiente = precoTotal - dinheiroRecebido;
            System.out.print("DINHEIRO INSUFICIENTE. FALTAM " + dinheiroInsuficiente + " REAIS");
        }
    }
}