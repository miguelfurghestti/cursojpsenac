import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        Double celsius,fahrenheit;

        System.out.println("Digite a temperatura em graus celsius: ");
        celsius =  leitura.nextDouble();

        fahrenheit = (celsius * 1.8) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit + " ºF");
        leitura.close();

    }
}
