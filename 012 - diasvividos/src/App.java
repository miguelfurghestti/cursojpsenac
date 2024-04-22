import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int idade;
        String nome;

        System.out.println("Qual o seu nome?");
        nome = leitura.nextLine();

        System.out.println("Qual a sua idade?");
        idade = leitura.nextInt();

        System.out.println(nome + ", VOCÊ JÁ VIVEU " + (idade*365) + " DIAS.");
        leitura.close();

    }
}
