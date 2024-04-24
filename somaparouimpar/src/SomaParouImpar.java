import java.util.Scanner;

public class SomaParouImpar {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número: ");
        numero = leitura.nextInt();

        if(numero % 2 == 0) {
            int resultado = numero + 5;
            System.out.println("O número é par, então " + numero + " + 5 = " + resultado);
        } else {
            int resultado = numero + 8;
            System.out.println("O número é impar, então " + numero + " + 8 = " + resultado);
        }
        
        leitura.close();
    }
}
