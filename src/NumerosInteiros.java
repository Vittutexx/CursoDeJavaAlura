import java.util.Scanner;

public class NumerosInteiros {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;

        //Início do game
        System.out.println("Escolha dois números.");
        System.out.println("Digite o primeiro número: ");
        n1 = leitura.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = leitura.nextInt();

        //Condicional
        if( n1 > n2){
            System.out.println("Os números são diferentes.");
            System.out.println("O primeiro numero é maior que o segundo número");
        } else if (n2 > n1) {
            System.out.println("Os números são diferentes.");
            System.out.println("O segundo número é maior que o primeiro.");
        } else {
            System.out.println("Os números são iguais");
        }

    }

}
