import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int frangos;
        double anelChips,anelAlimento, totalGasto;

        System.out.println("Qual a quantidade atual de frango na granja Frangotech?");
        frangos = leitura.nextInt();

        anelChips = frangos * 1;
        anelAlimento = frangos * 2;

        totalGasto = (anelChips * 4.00) + (anelAlimento * 3.50);

        System.out.println("Para esta quantidade de frango, a Frangotech vai ter que gastar: R$ " + totalGasto);

        leitura.close();


    }
}
