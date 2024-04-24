import java.util.Scanner;
import java.util.Calendar;

public class IdadeVoto {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();

        int anonascimento;

        System.out.println("Digite o seu ano de nascimento? ");
        anonascimento = leitura.nextInt();

        int idade = cal.get(Calendar.YEAR) - anonascimento;

        System.out.println("A sua idade é: " + idade + " anos.");

        if(idade >= 16) {
            System.out.println("VOCÊ JÁ PODE VOTAR!");
        } else {
            System.out.println("VOCÊ AINDA NÃO PODE VOTAR");
        }

        leitura.close();
    }
}
