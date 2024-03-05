import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numAleatorio = new Random().nextInt(100);
        int qtdTentativas = 0;
        int tentativas;


        System.out.println("  JOGO DA ADIVINHAÇÃO  ");
        System.out.println("-----------------------");
        System.out.println("Chute um numero:");

        //Aplicando o loop
        while(qtdTentativas < 5 ){

            //leitura da tentativa
            tentativas = leitura.nextInt();

            //Se a tentiva for diferente do numero chutado, tentar novamente.
            if(tentativas != numAleatorio){
                System.out.println("Infelizmente não é esse o número... Mas continue tentando!");
                qtdTentativas++;

            } else {
                System.out.println("Parabéns, você acertou o número!");
                break;
            }
        }
        System.out.println("Fim das tentativas!");
        System.out.println("O número aleatório era: " + numAleatorio);
    }
}
