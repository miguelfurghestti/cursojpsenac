import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);

        double n1, n2, n3, media;
        

        System.out.println("Digite a primeira nota do aluno: ");
        n1 = leitura.nextDouble();

        System.out.println("Digite a segunda nota do aluno: ");
        n2 = leitura.nextDouble();

        System.out.println("Digite a terceira do aluno: ");
        n3 = leitura.nextDouble();

        media = ((n1 + n2 + n3) / 3);
        String mediaFormatada = String.format("%.1f", media);

        System.out.println("A média do aluno é: " + mediaFormatada);
        if(media >= 7) {
            System.out.println("Aluno Aprovado!");
        } else {
            System.out.println("Aluno Reprovado!");
        }

        leitura.close();

    }
}
