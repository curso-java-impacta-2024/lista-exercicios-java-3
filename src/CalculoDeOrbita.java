import java.util.Scanner;

public class CalculoDeOrbita {
    public static void main(String[] args) {
        double distanciaInicial = 150.0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o fator de mudança");
        double fatorMudanca = entrada.nextDouble();

        int ano;
        for(ano = 2024; ano <= 2034; ano++){
            distanciaInicial += distanciaInicial * fatorMudanca;
            System.out.printf("Ano %d: Distância ao Sol = %.2f milhões de quilômetros%n", ano, distanciaInicial);
        }

        entrada.close();
    }
}
