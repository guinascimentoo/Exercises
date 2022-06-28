import java.util.Locale;
import java.util.Scanner;

public class combustivel {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod_Alcool = 0;
        int cod_gasolina = 0;
        int cod_Diesel = 0;

        while(true) {
            System.out.println("Informe um codigo (1, 2, 3) ou 4 para parar: ");
            int cod = sc.nextInt();

            if (cod == 4) {
                break;
            } else if (cod == 1) {
                cod_Alcool ++;
            } else if (cod == 2) {
                cod_gasolina ++;
            } else if (cod == 3){
                cod_Diesel ++;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + cod_Alcool);
        System.out.println("Gasolina: " + cod_gasolina);
        System.out.println("Diesel" + cod_Diesel);
    }
}