import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitura =  new Scanner(System.in);

        double salario;
        
        System.out.println("Digite o salário atual para calcular o aumento: ");
        salario = leitura.nextDouble();

        salario = (salario + (salario * 0.25));
        System.out.println("O salário com aumento ficou em: R$ " + salario);

        leitura.close();
    }
}
