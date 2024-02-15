package br.com.alura.screenmatch.principal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.avalia(9);

        Filme filmeBom = new Filme();
        filmeBom.setNome("Exterminador Do Futuro");
        filmeBom.setDuracaoMin(160);
        filmeBom.avalia(8);

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeBom);
        lista.add(meuFilme);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme) {
                Filme filme = (Filme) item;
                System.out.println("Classificação:" + filme.getClassificacao());
            } else {
                System.out.println("Series não tem classificação");
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Pedro Pascal");
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Renato Aragão");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("---Reordenado---");
        System.out.println(buscaPorArtista);
        System.out.println("                ");
        for (int itens = 0; itens < lista.size(); itens++) {
            System.out.println(lista.get(itens).getNome());
        }
        Collections.sort(lista);
        System.out.println("---Reordenado---");
        for (int itens = 0; itens < lista.size(); itens++) {
            System.out.println(lista.get(itens).getNome());

        }
        System.out.println("---Reordenado Por Ano---");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

        for (int itens = 0; itens < lista.size(); itens++) {
            System.out.println(lista.get(itens).getNome());

        }
    }
}
