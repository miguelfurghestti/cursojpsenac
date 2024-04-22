import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int paes,broas;
        double arrecadado, poupanca;

        System.out.println("Quantos pães foram vendidos hoje?");
        paes = leitura.nextInt();

        System.out.println("Quantas broas foram vendidas hoje?");
        broas = leitura.nextInt();

        arrecadado = ((paes * 0.80) + (broas * 1.50));
        poupanca = (arrecadado * 0.10);

        System.out.println("Valor arrecadado no dia: R$ " + arrecadado);
        System.out.println("Guardado na poupança: R$ " + poupanca);

        leitura.close();
    }
}
