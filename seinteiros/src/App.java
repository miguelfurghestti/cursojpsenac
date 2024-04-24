import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);

        int a, b;
        
        System.out.println("Digite um número inteiro para A: ");
        a = leitura.nextInt();

        System.out.println("Digite um número inteiro para B: ");
        b = leitura.nextInt();

        if(a == b) {
            int resultado = a + b;
            System.out.println("a soma de A + B é igual: " + resultado);
        } else {
            int resultado = a * b;
            System.out.println("a multiplicação de A * B é igual: " + resultado);
        }

        leitura.close();

    }
}
