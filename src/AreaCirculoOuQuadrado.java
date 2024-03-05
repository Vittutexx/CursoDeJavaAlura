import java.util.Scanner;

public class AreaCirculoOuQuadrado {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao;
        int base;
        int altura;
        int resultado;
        double pi = 3.14;
        double raio;
        double diametro;
        double areaCirculo;

        System.out.println("Digite no seu teclado o numero 1 caso queira calcular a area de um quadrado," + "\n" +
                "caso queira calcular a área de um círculo, insira o número 2." + "\n" + "Caso queira sair, digite 3");

        opcao = leitura.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Insira o comprimento da base (em cm)");
                base = leitura.nextInt();
                System.out.println("Agora informe a altura (em cm)");
                altura = leitura.nextInt();
                resultado = (base * altura);
                System.out.println("Resultado: " + resultado + "cm².");
                break;

            case 2:
                System.out.println("Informe o diâmetro do círculo");
                diametro = leitura.nextDouble();
                raio = diametro / 2;
                areaCirculo = pi * Math.pow(raio, 2);
                System.out.println("a área do círculo é: " + areaCirculo);
                break;

            case 3:
                break;

        }
    }
}
