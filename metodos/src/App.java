import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);
        int n1, n2, opcao;

        System.out.println("Informe o número 1: ");
        n1 = leitura.nextInt();

        System.out.println("Informe o número 2: ");
        n2 = leitura.nextInt();

        System.out.println("Informe a opção:\n[1] - Soma\n[2] - Subtração\n[3] - Multiplicação\n[4] - Divisão ");
        opcao = leitura.nextInt();

        if(opcao == 1) {
            System.out.println("O resultado da soma é: " + soma(n1,n2));
        } else if (opcao == 2) {
            System.out.println("O resultado da subtração é: " + subtracao(n1,n2));
        } else if (opcao == 3) { 
            System.out.println("O resultado da multiplicação é: " + multiplicacao(n1,n2));
        } else {
            System.out.println("O resultado da divisão é: " + divisao(n1,n2));
        }

        fim();

    }
    
    public static int soma(int n1, int n2) {
        return n1 + n2;
    }

    public static int subtracao(int n1, int n2) {
        return n1 - n2;
    }

    public static int multiplicacao(int n1, int n2) {
        return n1 * n2;
    }

    public static double divisao(int n1, int n2) {
        return n1 / n2;
    }

    public static void fim() {
        System.out.println("Operação concluída com sucesso!");
    }
}
