import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);

        int ano;

        System.out.println("Digite um ano: ");
        ano = leitura.nextInt();

        if(ano % 4 == 0) {
            System.out.println("O ano " + ano + " é bissexto!");
        } else {
            System.out.println("O ano " + ano + " não é bissexto!");
        }

        leitura.close();
    }
}
