import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);

        ArrayList<Integer> idades = new ArrayList<>();
        int i;
        
        for(i = 1; i <= 8; i++)
        {
            System.out.println("Digite a idade:");
            idades.add(leitura.nextInt());
        }

        Integer maior = Collections.max(idades);

        System.out.println("A maior idade é " + maior + " e sua posição é " + idades.indexOf(maior));
    }
}
