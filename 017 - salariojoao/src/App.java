import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        Double salario = 1200.00;
        Double multaum = 200.00;
        Double multadois = 120.00;

        multaum = (multaum*0.02) + multaum;
        multadois = (multadois*0.02) + multadois;

        salario = salario - (multaum + multadois);

        System.out.println("Valor das multas com juros: R$ " + multaum + " " + multadois);
        System.out.println("O que sobrou do salário do João ao pagar as multas R$ " + salario);

        leitura.close();
    }
}
