import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;
import java.util.Scanner;

public class dentro_fora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int num = sc.nextInt();
        int dentro = 0;
        int fora = 0;

        for(int i=0; i<num; i++){
            System.out.print("Digite um numero: ");
            int x = sc.nextInt();

            if(x>=10 && x<=20)
                dentro++;
            else
                fora++;
        }
        System.out.println(dentro + " DENTRO");
        System.out.println(fora + " FORA");
    }
}