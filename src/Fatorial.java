import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int f;
        int resultado = 1;
        System.out.println("Informe o numero do fatorial");
        f = leitura.nextInt();
        for (int i = 1; i <= f; i++){
            resultado = resultado * i;
        }
        System.out.println("o fatorial de " + f + " é "+resultado);
    }
}
