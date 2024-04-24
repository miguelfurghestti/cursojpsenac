import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);

        String nome;
        Double anostrabalhados, salario;

        System.out.println("Olá, qual seu nome?");
        nome = leitura.nextLine();

        System.out.println("Você trabalha na empresa há quantos anos?");
        anostrabalhados = leitura.nextDouble();

        System.out.println("Qual o seu salário atualmente?");
        salario = leitura.nextDouble();

        if(anostrabalhados <= 3) {
            Double novosalario = salario + (salario*0.03);
            System.out.println("Parabéns " + nome + " seu novo salário é R$ " + novosalario);
        } else if (anostrabalhados > 3 && anostrabalhados < 10) {
            Double novosalario = salario + ((salario*12.5)/100);
            System.out.println("Parabéns " + nome + " seu novo salário é R$ " + novosalario);
        } else {
            Double novosalario = salario + ((salario*0.2));
            System.out.println("Parabéns " + nome + " seu novo salário é R$ " + novosalario);
        }
        leitura.close();


    }
}
