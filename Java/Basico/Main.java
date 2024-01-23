public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Screen Match");
        System.out.println("Filme: Top Gun Maverick");
        int AnoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + AnoDeLancamento);
        boolean IncluidoNoPlano = false;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse = "Filme de aventura com galâ dos anos 80";
        System.out.println(sinopse);
        String blocoTexto = """
                fica bem do xesque
                do dele
                do relens
                """;
        System.out.println(blocoTexto);

        int classificacao;
        // o int serve para pegar um double e transformar ele em inteiro = casting
        classificacao = (int) (media / 2);
        System.out.println(classificacao);

        String tipoPlano = "plus";

        if (AnoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assitir");
        }
        if (IncluidoNoPlano || tipoPlano.equals("plus")) {
            System.out.println("Filme Liberado");
        } else {
            System.out.println("deve pagar a locação");
        }

    }
}