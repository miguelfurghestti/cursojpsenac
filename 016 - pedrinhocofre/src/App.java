import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        // Pedrinho tem um cofrinho com muitas moedas, e deseja saber quantos reais conseguiu poupar. Faça um algoritmo para ler a quantidade de cada tipo de moeda, e imprimir o valor total economizado, em reais. Considere que existam moedas de 1, 5, 10, 25 e 50 centavos, e ainda moedas de 1 real. Não havendo moeda de um tipo, a quantidade respectiva é zero.

        double umcentavo,cincocentavos,dezcentavos,vintecincocentavos,cinquentacentavos,umreal,total;

        System.out.println("Vamos contar as moedas no cofre do Pedrinho:");
        
        System.out.println("Digite quantas moedas de um centavo possui no cofre: ");
        umcentavo = leitura.nextInt();
        umcentavo = umcentavo * 0.01;

        System.out.println("Digite quantas moedas de cinco centavos possui no cofre: ");
        cincocentavos = leitura.nextInt();
        cincocentavos = cincocentavos * 0.05;

        System.out.println("Digite quantas moedas de dez centavos possui no cofre: ");
        dezcentavos = leitura.nextInt();
        dezcentavos = dezcentavos * 0.10;

        System.out.println("Digite quantas moedas de vinte e cinco centavos possui no cofre: ");
        vintecincocentavos = leitura.nextInt();
        vintecincocentavos = vintecincocentavos * 0.25;

        System.out.println("Digite quantas moedas de cinquenta centavos possui no cofre: ");
        cinquentacentavos = leitura.nextInt();
        cinquentacentavos = cinquentacentavos * 0.50;

        System.out.println("Digite quantas moedas de um real possui no cofre: ");
        umreal = leitura.nextInt();
        umreal = umreal * 1.00;

        total = umcentavo + cincocentavos + dezcentavos + vintecincocentavos + cinquentacentavos + umreal;
        
        System.out.println("No cofre do Pedrinho tem: R$ " + total);
        
        leitura.close();
    }
}
