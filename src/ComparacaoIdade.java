import java.util.Scanner;

public class ComparacaoIdade {
    public static void main(String[] args) {
        int planeta1;
        int planeta2;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a idade do planeta 1");
        planeta1 = entrada.nextInt();
        System.out.println("Digite a idade do planeta 2");
        planeta2 = entrada.nextInt();

        entrada.close();

        if(planeta1 > planeta2){
            System.out.println("O planeta 1 é mais antigo");
        }else if(planeta1 < planeta2){
            System.out.println("O planeta 2 é mais antigo");
        } else {
            System.out.println("Os dois planetas tem a mesma idade");
        }
    }
}
