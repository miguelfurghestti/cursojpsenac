import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int a,b,c,resultado;

        System.out.println("Digite o valor de A: ");
        a = leitura.nextInt();

        System.out.println("Digite o valor de B: ");
        b = leitura.nextInt();

        System.out.println("Digite o valor de C: ");
        c = leitura.nextInt();

        resultado = (a + b + c);
        resultado = resultado * resultado;

        System.out.println("O quadrado da soma ficou em: " + resultado);
        leitura.close();
    }
}
