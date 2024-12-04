package org.example.entities.atributos;

public class Dano {
    private double danoSemBlindagem;
    private double danoContraBlindagemLeve;
    private double danoContraBlindagemPessada;
    private double danoContraAviao;
    private double danoContraNavio;
    private double danoContraSubmarino;
    private double danoContraEdificio;
    private double danoContraMoral;

    public Dano(double danoSemBlindagem, double danoContraBlindagemLeve, double danoContraBlindagemPessada, double danoContraAviao, double danoContraNavio, double danoContraSubmarino, double danoContraEdificio, double danoContraMoral) {
        this.danoSemBlindagem = danoSemBlindagem;
        this.danoContraBlindagemLeve = danoContraBlindagemLeve;
        this.danoContraBlindagemPessada = danoContraBlindagemPessada;
        this.danoContraAviao = danoContraAviao;
        this.danoContraNavio = danoContraNavio;
        this.danoContraSubmarino = danoContraSubmarino;
        this.danoContraEdificio = danoContraEdificio;
        this.danoContraMoral = danoContraMoral;
    }

    public double getDanoSemBlindagem() {
        return danoSemBlindagem;
    }

    public void setDanoSemBlindagem(double danoSemBlindagem) {
        this.danoSemBlindagem = danoSemBlindagem;
    }

    public double getDanoContraBlindagemLeve() {
        return danoContraBlindagemLeve;
    }

    public void setDanoContraBlindagemLeve(double danoContraBlindagemLeve) {
        this.danoContraBlindagemLeve = danoContraBlindagemLeve;
    }

    public double getDanoContraBlindagemPessada() {
        return danoContraBlindagemPessada;
    }

    public void setDanoContraBlindagemPessada(double danoContraBlindagemPessada) {
        this.danoContraBlindagemPessada = danoContraBlindagemPessada;
    }

    public double getDanoContraAviao() {
        return danoContraAviao;
    }

    public void setDanoContraAviao(double danoContraAviao) {
        this.danoContraAviao = danoContraAviao;
    }

    public double getDanoContraNavio() {
        return danoContraNavio;
    }

    public void setDanoContraNavio(double danoContraNavio) {
        this.danoContraNavio = danoContraNavio;
    }

    public double getDanoContraSubmarino() {
        return danoContraSubmarino;
    }

    public void setDanoContraSubmarino(double danoContraSubmarino) {
        this.danoContraSubmarino = danoContraSubmarino;
    }

    public double getDanoContraEdificio() {
        return danoContraEdificio;
    }

    public void setDanoContraEdificio(double danoContraEdificio) {
        this.danoContraEdificio = danoContraEdificio;
    }

    public double getDanoContraMoral() {
        return danoContraMoral;
    }

    public void setDanoContraMoral(double danoContraMoral) {
        this.danoContraMoral = danoContraMoral;
    }

    @Override
    public String toString() {
        return "Dano{" +
                "danoSemBlindagem=" + danoSemBlindagem +
                ", danoContraBlindagemLeve=" + danoContraBlindagemLeve +
                ", danoContraBlindagemPessada=" + danoContraBlindagemPessada +
                ", danoContraAviao=" + danoContraAviao +
                ", danoContraNavio=" + danoContraNavio +
                ", danoContraSubmarino=" + danoContraSubmarino +
                ", danoContraEdificio=" + danoContraEdificio +
                ", danoContraMoral=" + danoContraMoral +
                '}';
    }
}
