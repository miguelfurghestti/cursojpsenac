import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int valor;

        System.out.println("Digite um valor: ");
        valor = leitura.nextInt();

        System.out.println("O antecessor de " + valor + " é " + (valor-1) + " e o sucessor é " + (valor+1));
        leitura.close();
    }
}
