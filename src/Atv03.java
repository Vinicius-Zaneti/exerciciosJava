import java.util.Scanner;

public class Atv03 {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Digite um numero: ");
            numero = leitor.nextInt();


        } while (numero != 0);
        System.out.print("Você digitou o numero 0! ");
    }
}
