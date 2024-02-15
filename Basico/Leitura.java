import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println(filme);
        System.out.println("Qual o ano de lançamento?");
        int AnoDeLancamento = leitura.nextInt();
        System.out.println(AnoDeLancamento);
        System.out.println("Diga sua avaliação para o filme");
        double avaliacao = leitura.nextDouble();

        System.out.println("Seus Dados");
        System.out.println(filme);
        System.out.println(AnoDeLancamento);
        System.out.println(avaliacao);
    }
}
