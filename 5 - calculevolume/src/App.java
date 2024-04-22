import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double volume, comprimento, largura, altura;

        System.out.println("Para descobrir o volume da caixa, digite o COMPRIMENTO: ");
        comprimento = leitura.nextDouble();

        System.out.println("Agora digite a LARGURA: ");
        largura = leitura.nextDouble();

        System.out.println("Agora digite a ALTURA: ");
        altura = leitura.nextDouble();

        volume = comprimento * largura * altura;

        System.out.println("O VOLUME da caixa é: " + volume);

        leitura.close();
        
    }
}
