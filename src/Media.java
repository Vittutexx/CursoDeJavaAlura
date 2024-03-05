public class Media {
    public static void main(String[] args) {

        // exercicio 1
        double nota1 = 8.5;
        double nota2 = 6.6;
        double media = (nota1 + nota2) / 2;
        System.out.println(media);

        // exercicio 2
        nota2 = (int) 6;
        System.out.println(media);

        // exercicio 3
        char letra = 'a';
        String palavra = "amand";
        System.out.println(palavra + letra);

        // exercicio 4
        double precoProduto = 5;
        int quantidade = 3;
        double valorTotal = precoProduto * quantidade;
        System.out.println(valorTotal);

        // exercicio 5
        double valorEmDolares = 4.95    ;
        double valorEmReais = 5;
        double conversãoDolaresParaReais = valorEmReais * valorEmDolares;
        System.out.println(conversãoDolaresParaReais);

        // exercicio 6
        double precoOriginal = 9.90;
        double percentualDesconto = 10;
        double precoComDesconto =  precoOriginal - ((precoOriginal * percentualDesconto) / 100);

        System.out.println("Preço do produto com desconto aplicado: " + precoComDesconto);




    }
}
