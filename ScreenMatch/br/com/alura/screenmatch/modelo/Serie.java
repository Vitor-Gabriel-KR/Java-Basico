package br.com.alura.screenmatch.modelo;

public class Serie extends Titulo {
    private int temporadas;
    private int epsodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpsodio;

    public Serie(String nome, int anoDelancamento) {
        super(nome, anoDelancamento);
    }

    public Serie() {

    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporada(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpsodiosPorTemporada() {
        return epsodiosPorTemporada;
    }

    public void setEpsodiosPorTemporada(int epsodiosPorTemporada) {
        this.epsodiosPorTemporada = epsodiosPorTemporada;
    }

    public boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpsodio() {
        return minutosPorEpsodio;
    }

    public void setMinutosPorEpsodio(int minutosPorEpsodio) {
        this.minutosPorEpsodio = minutosPorEpsodio;
    }

    @Override
    public int getDuracaoMin() {
        return temporadas * epsodiosPorTemporada * minutosPorEpsodio;
    }
}
