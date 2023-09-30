import java.util.Scanner;

public class Atv02 {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);
        //String senha ;
        String senha;
        do {
            System.out.print("Digite a Senha: ");
            senha = leitor.nextLine();
            if (!senha.equals("123")) {

                System.out.println("Senha incorreta!");
            }
        } while (!senha.equals("123"));

        System.out.println("Senha correta!");

    }
}
