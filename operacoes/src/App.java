import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int numero1;
        int numero2;
        int resultado;

        System.out.println("Vamos calcular!");

        System.out.println("Digite o primeiro número: ");
        numero1 = leitura.nextInt();

        System.out.println("Digite o segundo número: ");
        numero2 = leitura.nextInt();

        resultado = numero1 + numero2;
        System.out.println("Soma: " + numero1 + " + " + numero2 + " Resultado: " + resultado);

        resultado = numero1 - numero2;
        System.out.println("Subtração: " + numero1 + " - " + numero2 + " Resultado: " + resultado);

        resultado = numero1 * numero2;
        System.out.println("Multiplicação: " + numero1 + " * " + numero2 + " Resultado: " + resultado);

        resultado = numero1 / numero2;
        System.out.println("Divisão: " + numero1 + " / " + numero2 + " Resultado: " + resultado);

        leitura.close();
        
    }
}
