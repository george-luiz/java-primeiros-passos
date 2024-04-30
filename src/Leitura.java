import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        // classe Scanner do Java é utilizada para ler dados de entrada
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.next();


        System.out.println("Qual o nome de lançamento?");
        int anoDeLançamento = leitura.nextInt();

        System.out.println("Digite sua avaliação!");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLançamento);
        System.out.println(avaliacao);
    }
}
