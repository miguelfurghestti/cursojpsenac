import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        for(int i = 1; i <= 5; i++) {
            System.out.println("Digite a " + i + " nota:");
            notas.add(leitura.nextDouble());
        }

        System.out.println("A média das notas é: " + mediaNota(notas));
        
    }

    public static double mediaNota(ArrayList<Double> notas){

        double somaNota = 0.0;
        // for(int i = 0; i < notas.size(); i++) {
        //     somaNota = somaNota + notas.get(i);
        // }

        for (Double nota : notas) {
            somaNota = somaNota + nota;
        }
        
        return somaNota / notas.size();

    }

}
