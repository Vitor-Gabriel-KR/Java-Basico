import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        double media1 = 0;
        double nota1 = 0;
        int totalDeNotas = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme");
            nota = leitura.nextDouble();
            media += nota;

        }
        System.out.println("Media de avaliações: " + media / media);

        while (nota1 != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar");
            nota1 = leitura.nextDouble();
            media1 += nota1;
            totalDeNotas++;
        }
        System.out.println("Media de avaliações: " + media1 / totalDeNotas);
    }

}
