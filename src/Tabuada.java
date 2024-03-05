import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero;
        int multiplicador = 0;
        int resultado;

        System.out.println("Insira um numero inteiro.");
        numero = leitura.nextInt();

        if (numero > 0){
            for(int i = 0; i < 10; i++){
                multiplicador++;
                resultado = (numero * multiplicador);
                System.out.println(numero + " x " + multiplicador + " = " + resultado);

            }
        }

    }

}
