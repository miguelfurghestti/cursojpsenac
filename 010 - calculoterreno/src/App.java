import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double largura,comprimento,total;

        System.out.println("Digite a Largura do terreno: ");
        largura = leitura.nextDouble();

        System.out.println("Digite o comprimento do terreno: ");
        comprimento = leitura.nextDouble();

        total = largura * comprimento;

        System.out.println("A área total do terreno é de: " + total + "m²");

        leitura.close();
    }
}
