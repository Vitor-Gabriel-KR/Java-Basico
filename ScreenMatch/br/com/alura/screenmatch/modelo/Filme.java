package br.com.alura.screenmatch.modelo;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public Filme(String nome, int anoDelancamento) {
        this.setNome(nome);
        this.setAnoDeLancamento(anoDelancamento);
    }

    public Filme() {

    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) mediaAvaliacoes() / 2;
    }
}
