import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double valorfabrica;
        double valorvenda;
        double imposto;

        System.out.println("Digite o valor de fábrica do veículo: ");
        valorfabrica = leitura.nextDouble();

        imposto = 0.45 * valorfabrica;
        valorvenda = valorfabrica + imposto;

        System.out.println("O valor de venda do veículo é de: R$ " + valorvenda);

        leitura.close();
    }
}
