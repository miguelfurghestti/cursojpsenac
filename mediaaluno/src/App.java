import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double media;

        System.out.println("Digite a primeira nota: ");
        nota1 = leitura.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = leitura.nextDouble();

        System.out.println("Digite a terceira nota: ");
        nota3 = leitura.nextDouble();
        
        media = ((nota1 + nota2 + nota3) / 3);

        System.out.println("A média do aluno é: " + media);
        leitura.close();
    }
}
