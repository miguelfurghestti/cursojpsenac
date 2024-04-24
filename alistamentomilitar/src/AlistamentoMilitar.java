import java.util.Scanner;
import java.util.Calendar;

public class AlistamentoMilitar {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        int anonascimento, idade;

        System.out.println("Qual seu ano de nascimento?"); 
        anonascimento = leitura.nextInt();

        idade = cal.get(Calendar.YEAR) - anonascimento;

        if(idade < 18) {
            int anos = 18 - idade;
            System.out.println("Faltam " + anos + " anos para o seu alistamento militar.");
        } else {
            int anos = idade - 18;
            System.out.println("Já se passaram " + anos + " anos para o seu alistamento.");
        }

        leitura.close();

    }
}
