import java.util.Scanner;

public class ImparOuPar {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero;

        System.out.println("Insira o numero que deseja:");
        numero = leitura.nextInt();

        if (numero > 0) {
            System.out.println("O número que você digitou é positivo.");
        } else {
            System.out.println("O número que você digitou é negativo.");
        }
    }
}