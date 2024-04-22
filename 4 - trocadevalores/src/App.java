import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int a,b,c;

        System.out.println("Digite um valor para A: ");
        a = leitura.nextInt();

        System.out.println("Digite um valor para B: ");
        b = leitura.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println("Agora A tem o valor de: " + a);
        System.out.println("Agora B tem o valor de: " + b);
        leitura.close();
    }
}
