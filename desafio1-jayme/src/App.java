import java.util.ArrayList;
import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);

        ArrayList<String> nome = new ArrayList<>();
        ArrayList<String> genero = new ArrayList<>();
        ArrayList<Double> salario = new ArrayList<>();

        int i = 0;

        for(i = 1; i <= 5; i++)
        {
            System.out.println("Digite o nome da " + i + "ª pessoa.");
            nome.add(leitura.nextLine());

            System.out.println("Digite o gênero da " + i + "ª pessoa. [F] Feminino [M] Masculino");
            genero.add(leitura.nextLine());

            System.out.println("Digite o salario da " + i + "ª pessoa.");
            salario.add(leitura.nextDouble());

            leitura.nextLine();
        }

        for(i = 0; i < nome.size(); i++)
        {
            if(genero.get(i).equalsIgnoreCase("F") && salario.get(i) > 5000) {
                System.out.println(nome.get(i) + " ganha mais que R$ 5000 ela ganha: R$ " + salario.get(i));
            }
        }
        
    }
}
