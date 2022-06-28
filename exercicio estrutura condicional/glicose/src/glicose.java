import java.util.Locale;
import java.util.Scanner;

public class glicose {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida da glicose: ");
        double medidaGlisoce = sc.nextDouble();

        if(medidaGlisoce <= 100){
            System.out.println("Classificação: normal");
        }
        if(medidaGlisoce > 100 && medidaGlisoce <= 140){
            System.out.println("Classificação: elevado");
        }
        if(medidaGlisoce > 140){
            System.out.println("Classificação: diabetes");
        }
    }
}