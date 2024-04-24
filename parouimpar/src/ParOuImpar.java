import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);
        
        int numero;

        System.out.println("Digite um número");
        numero = leitura.nextInt();

        if(numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é impar.");
        }

        leitura.close();

    }
}
