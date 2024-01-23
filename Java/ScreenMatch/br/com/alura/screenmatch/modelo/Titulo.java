package br.com.alura.screenmatch.modelo;

public class Titulo {

    private String nome;
    private int anoDelancamento;
    private boolean incluindoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoMin;
    private double duracaoHr = duracaoMin / 60;

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDelancamento) {
        this.anoDelancamento = anoDelancamento;
    }

    public void setDuracaoMin(int duracaoMin) {
        this.duracaoMin = duracaoMin;
    }

    public int getDuracaoMin() {
        return duracaoMin;
    }

    public void exibirFichaTecnica() {

        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDelancamento);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double mediaAvaliacoes() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

}
