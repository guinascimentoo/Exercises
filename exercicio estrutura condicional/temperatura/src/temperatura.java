import java.util.Locale;
import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        char escala = sc.next().charAt(0);

        if(escala == 'F'){
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double tempFahrenheit = sc.nextDouble();
            double celcius = (tempFahrenheit - 32) / 1.8;
            System.out.printf("Temperatura equivalente em Celsius: %.2f%n", celcius);
        }
        if(escala == 'C'){
            System.out.print("Digite a temperatura em Celsius: ");
            double tempCelcius = sc.nextDouble();
            double fahrenheit = (1.8 * tempCelcius) + 32;
            System.out.printf("Temperatura equivalente em Celsius: %.2f%n", fahrenheit);
        }
    }
}
