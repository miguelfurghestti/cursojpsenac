import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);

        Double numero;

        System.out.println("Digite um número: ");
        numero = leitura.nextDouble();

        if(numero >= 0) {
            System.out.println("O número é POSITIVO, o dobro é: " + (numero * 2));
        } else {
            System.out.println("O número é NEGATIVO, o tripo é: " + (numero * 3));
        }

        leitura.close();
    }
}
