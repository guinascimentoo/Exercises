import java.util.Locale;
import java.util.Scanner;

public class senha_fixa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastre uma senha: ");
        int cad_senha = sc.nextInt();

        System.out.print("Digite a senha: ");
        int senha = sc.nextInt();

        while(senha != cad_senha){
            System.out.print("Senha Invalida! Tente novamente: ");
            senha = sc.nextInt();
        }
        System.out.println("Acesso permitido!");
    }
}