import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        Double real, dolar, resultado;

        System.out.println("Digite o valor em R$ que você deseja converter para $: ");
        real = leitura.nextDouble();

        System.out.println("Digite o valor da cotação atual do dólar $: ");
        dolar = leitura.nextDouble();

        resultado = real * dolar;

        System.out.println("O valor R$ " + real + " em dólar é: $ " + resultado);
    }
}
