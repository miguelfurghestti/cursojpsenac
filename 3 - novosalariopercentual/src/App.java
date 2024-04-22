import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double salario;
        double percentual;

        System.out.println("Qual o salário do funcionário? ");
        salario = leitura.nextDouble();

        System.out.println("Qual o percentual de aumento a se considerar? (Ex: 25) ");
        percentual = leitura.nextDouble();

        percentual = percentual * 0.01;

        salario = salario + (percentual * salario);

        System.out.println("O novo salário do funcionário ficou em: R$ " + salario);
        leitura.close();
    }
}
