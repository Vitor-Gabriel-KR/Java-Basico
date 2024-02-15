package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelo.Episodio;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;

import java.util.ArrayList;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.Recomendacao;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoMin(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoMin());

        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(9);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Media de avaliações: " + meuFilme.mediaAvaliacoes());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibirFichaTecnica();
        lost.setTemporada(10);
        lost.setMinutosPorEpsodio(60);
        lost.setEpsodiosPorTemporada(10);
        lost.setMinutosPorEpsodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoMin());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(lost);
        calculadora.getTempoTotal();
        System.out.println(calculadora.getTempoTotal());

        Recomendacao filtro = new Recomendacao();
        filtro.filtro(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalDeVisualizacoes(300);
        filtro.filtro(episodio);

        Filme filmeBom = new Filme();
        filmeBom.setNome("Exterminador Do Futuro");
        filmeBom.setDuracaoMin(160);
        filmeBom.setAnoDeLancamento(2000);
        filmeBom.avalia(9);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeBom);
        listaDeFilmes.add(meuFilme);
        System.out.println("Tamanho Da Lista: " + listaDeFilmes.size());
        System.out.println("Primeiro Filme: " + listaDeFilmes.get(0).getNome());

        for (int i = 0; i < listaDeFilmes.size(); i++) {
            System.out.println(listaDeFilmes.get(i).getNome());
        }

        Filme filmeComConstrutor = new Filme("Kung Fu Panda 4", 2016);
        filmeComConstrutor.setDuracaoMin(95);
        System.out.println("Duração do filme: " + filmeComConstrutor.getDuracaoMin());
        System.out.println(filmeComConstrutor.getNome());

        Serie serieComConstrutor = new Serie("The Walking Dead", 2000);
        serieComConstrutor.exibirFichaTecnica();
        serieComConstrutor.setTemporada(13);
        serieComConstrutor.setMinutosPorEpsodio(28);
        serieComConstrutor.setEpsodiosPorTemporada(12);
        System.out
                .println("Duração para maratonar The Walking Dead: " + serieComConstrutor.getDuracaoMin() + " Minutos");
    }

}
