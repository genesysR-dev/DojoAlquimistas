import java.util.Scanner;

public class Conversao {
    public static void main (String[] args) {
        
        
        Scanner leitor = new Scanner(System.in);

        double real;
        System.out.println("Insira um valor em Real: ");
        real = leitor.nextDouble();
       // Double.parseDouble(dolar);
       
        double tipo_cambio_dolar = 5.20;
        double conversao = real / tipo_cambio_dolar;
        // conversao = (double) Math.round(conversao *100d)/100;
    
         System.out.printf("O valor da conversão do Real para Dólar é: %.2f", conversao);
        
    }
}
