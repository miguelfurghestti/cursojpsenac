import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String sexo, nome;
        Double valor;


        System.out.println("Olá, qual o seu nome?");
        nome = leitura.nextLine();

        
        System.out.println("H - Homem");
        System.out.println("M - Mulher");
        sexo = leitura.nextLine();
        
        System.out.println("Valor da compra?");
        valor = leitura.nextDouble();

        if(sexo.equals("H")) {
            valor = valor - (valor*0.05);
            System.out.println("Você selecionou " + sexo);
        } else {
            valor = valor - (valor*0.13);
            System.out.println("Você selecionou " + sexo);
        }

        System.out.println("Olá " + nome + " você ganhou um desconto e suas compras ficaram em: R$ " + valor);

        leitura.close();

    
    }

}
