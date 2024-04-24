import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Digite o primeiro número:");
        numero1 = leitura.nextInt();

        System.out.println("Digite o segundo número:");
        numero2 = leitura.nextInt();

        if(numero1 > numero2) {
            System.out.println("O primeiro número é maior. Número " + numero1);
        } else if (numero1 < numero2) {
            System.out.println("O segundo número é maior. Número " + numero2);
        } else if (numero1 == numero2) {
            System.out.println("Os dois números são iguais: Números " + numero1 + " - " + numero2);
        }

        leitura.close();
    }
}
