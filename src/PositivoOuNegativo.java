import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroReal = 0;

        System.out.println("Escreva um numero: ");
        numeroReal = leitura.nextInt();

            if (numeroReal > 0){
                System.out.println("Número positivo");
            } else {
                System.out.println("Número negativo");
            }


    }
}
