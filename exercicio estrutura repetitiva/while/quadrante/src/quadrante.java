import java.util.Locale;
import java.util.Scanner;

public class quadrante {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        do {
            System.out.println("Digite os valores das coordenadas X e Y:");
            num1 = sc.nextInt();
            num2 = sc.nextInt();

            if(num1 > 0 && num2 > 0) {
                System.out.printf("QUADRANTE Q1\n");
            }

            {
                System.out.printf("QUADRANTE Q2\n");
            }

            {
                System.out.printf("QUADRANTE Q3\n");
            }

            {
                System.out.printf("QUADRANTE Q4\n");
            }
        }
        while (num1 != 0 && num2 != 0);
    }
}