public class GrausCelsiusParaFarenheit {


    public static void main(String[] args) {
    int celsius;
    celsius = 31;
    int fahrenheit;
    fahrenheit = 32;
    double paraFahrenheit = (double) (celsius * 1.8) + fahrenheit;
    String resultado = """
                O valor de graus em celsius de: %d Cº
                será de %f Fº
                """.formatted(celsius, paraFahrenheit);


        System.out.println(resultado);



    }

}
