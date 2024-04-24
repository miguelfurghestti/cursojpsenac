import java.util.Scanner;

public class FormaPagamento {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);
        
        int formadepagamento, valorproduto;

        System.out.println("Qual o valor do produto?");
        valorproduto = leitura.nextInt();

        System.out.println("Qual será a forma de pagamento:");
        System.out.println("1 - À vista em dinheiro ou cheque, recebe 10% de desconto");
        System.out.println("2 - À vista no cartão de crédito, recebe 15% de desconto");
        System.out.println("3 - Em duas vezes, preço normal de etiqueta sem juros");
        System.out.println("4 - Em três vezes, preço normal de etiqueta mais juros de 10%");
        formadepagamento = leitura.nextInt();

        if(formadepagamento == 1) {
            double valorfinal = (valorproduto - (valorproduto*0.10));
            System.out.println("O valor final do produto com 10% de desconto ficou em: R$ " + valorfinal);
        } else if(formadepagamento == 2) {
            double valorfinal = (valorproduto - (valorproduto*0.15));
            System.out.println("O valor final do produto com 15% de desconto ficou em: R$ " + valorfinal);
        } else if(formadepagamento == 3) {
            System.out.println("O valor final do produto sem juros ficou em: R$ " + valorproduto);
        } else if(formadepagamento == 4) {
            double valorfinal = (valorproduto + (valorproduto*0.10));
            System.out.println("O valor final do produto com 10% de juros ficou em: R$ " + valorfinal);
        } else {
            System.out.println("A opção escolhida não existe, tente novamente!");
        }

        leitura.close();
        
    }
}
