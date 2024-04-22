import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double salarioLiquido, salarioBruto, horasNm, horasEx;
        int horasNormais, horasExtras;

        System.out.println("Digite o número de horas normais trabalhadas neste mês: ");
        horasNormais = leitura.nextInt();

        System.out.println("Digite o número de horas extras trabalhadas neste mês: ");
        horasExtras = leitura.nextInt();

        horasNm = (horasNormais * 10.0);
        horasEx = (horasExtras * 15.0);

        salarioBruto = horasNm + horasEx;
        salarioLiquido = salarioBruto - (salarioBruto*0.10);

        System.out.println("Seu salário Bruto: R$ " + salarioBruto);
        System.out.println("Seu salário Liquido: R$ " + salarioLiquido);


        leitura.close();
        
    }
}
