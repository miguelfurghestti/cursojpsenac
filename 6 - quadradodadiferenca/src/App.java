import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int a, b, resultado;

        System.out.println("Digite um valor para A: ");
        a = leitura.nextInt();

        System.out.println("Digite um valor para B: ");
        b = leitura.nextInt();

        if(a > b) {
            resultado = a - b;
        } else {
            resultado = b - a;
        }

        resultado = resultado * resultado;

        System.out.println("O valor quadrado da diferença dos dois valores é: " + resultado);

    }
}
