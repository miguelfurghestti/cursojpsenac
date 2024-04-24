import java.util.Scanner;

public class VelocidadeCarro {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);

        int velocidade;

        System.out.println("Digite a velocidade do carro em Km/h: ");
        velocidade = leitura.nextInt();

        if(velocidade > 80) {
            System.out.println("Você foi multado!!!");
            int multa = ((velocidade - 80) * 5);
            System.out.println("O valor da multa ficou em: R$ " + multa);
        }

        leitura.close();
    }
}
