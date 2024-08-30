import java.util.Scanner;

public class EventoHistorico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ano;

        do {
            System.out.println("Entre com um ano para vermos o evento histórico");
            ano = entrada.nextInt();

            switch (ano) {
                case (476):
                    System.out.println("476 - Queda do Império Romano do Ocidente");
                    break;
                case (1492):
                    System.out.println("1492 - Descobrimento da América por Cristóvão Colombo");
                    break;
                case (1789):
                    System.out.println("1789 - Início da Revolução Francesa");
                    break;
                case (1865):
                    System.out.println("1865 - Fim da Guerra Civil Americana");
                    break;
                case (1914):
                    System.out.println("1914 - Início da Primeira Guerra Mundial");
                    break;
                case (1969):
                    System.out.println("1969 - Chegada do homem à Lua");
                    break;
                case (1989):
                    System.out.println("1989 - Queda do Muro de Berlim");
                    break;
                case (2001):
                    System.out.println("2001 - Ataques de 11 de setembro nos EUA");
                    break;
                case (2020):
                    System.out.println("2020 - Pandemia de COVID-19A");
                    break;
                default:
                    if (ano >= 0) {
                        System.out.println("Ano não identificado. Por favor, insira um ano conhecido.");
                    }
                    break;
            }
        } while (ano >= 0) ; // Continua pedindo anos enquanto o número for positivo

        System.out.println("Programa encerrado.");
        entrada.close();
    }
}
