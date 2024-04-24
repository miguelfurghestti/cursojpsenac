import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Scanner leitura = new Scanner(System.in);
        
        Double largura, comprimento, totalterreno;

        System.out.println("Digite a largura do terreno:");
        largura = leitura.nextDouble();

        System.out.println("Digite o comprimento do terreno:");
        comprimento = leitura.nextDouble();

        totalterreno = largura * comprimento;

        if(totalterreno <= 100) {
            System.out.println("TERRENO POPULAR: " + totalterreno + "m²");
        } else if(totalterreno > 100 && totalterreno < 500) {
            System.out.println("TERRENO MASTER: " + totalterreno + "m²");
        } else {
            System.out.println("TERRENO VIP: " + totalterreno + "m²");
        }

        leitura.close();


    }
}
