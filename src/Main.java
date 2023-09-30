// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String[] listaProfessores = {"Alana", "Thiago", "Samanta", "Alexia", "Odirlei"};

        for (int contador = 0; contador < listaProfessores.length; contador++){
            System.out.println("O índice atual é: " + contador);

            if (contador == 0){
                System.out.println("O número de índice do(a) professor(a)"+listaProfessores[contador] + " é Zero");
            } else if (contador % 2 == 0) {
                System.out.println("O número de indice do(a) professor(a)" + listaProfessores[contador] + " é Par");
            } else {
                System.out.println("O número de indice do(a) professor(a)" + listaProfessores[contador] + " é Impar");
            }
        }
    }
}