package org.example.entities.atributos;

public class Defesa {
    private double defesaSemBlindagem;
    private double defesaContraBlindagemLeve;
    private double defesaContraBlindagemPessada;
    private double defesaContraAviao;
    private double defesaContraNavio;
    private double defesaContraSubmarino;
    private double defesaContraEdificio;

    public Defesa(double defesaSemBlindagem, double defesaContraBlindagemLeve, double defesaContraBlindagemPessada, double defesaContraAviao, double defesaContraNavio, double defesaContraSubmarino, double defesaContraEdificio) {
        this.defesaSemBlindagem = defesaSemBlindagem;
        this.defesaContraBlindagemLeve = defesaContraBlindagemLeve;
        this.defesaContraBlindagemPessada = defesaContraBlindagemPessada;
        this.defesaContraAviao = defesaContraAviao;
        this.defesaContraNavio = defesaContraNavio;
        this.defesaContraSubmarino = defesaContraSubmarino;
        this.defesaContraEdificio = defesaContraEdificio;
    }

    public double getDefesaSemBlindagem() {
        return defesaSemBlindagem;
    }

    public void setDefesaSemBlindagem(double defesaSemBlindagem) {
        this.defesaSemBlindagem = defesaSemBlindagem;
    }

    public double getDefesaContraBlindagemLeve() {
        return defesaContraBlindagemLeve;
    }

    public void setDefesaContraBlindagemLeve(double defesaContraBlindagemLeve) {
        this.defesaContraBlindagemLeve = defesaContraBlindagemLeve;
    }

    public double getDefesaContraBlindagemPessada() {
        return defesaContraBlindagemPessada;
    }

    public void setDefesaContraBlindagemPessada(double defesaContraBlindagemPessada) {
        this.defesaContraBlindagemPessada = defesaContraBlindagemPessada;
    }

    public double getDefesaContraAviao() {
        return defesaContraAviao;
    }

    public void setDefesaContraAviao(double defesaContraAviao) {
        this.defesaContraAviao = defesaContraAviao;
    }

    public double getDefesaContraNavio() {
        return defesaContraNavio;
    }

    public void setDefesaContraNavio(double defesaContraNavio) {
        this.defesaContraNavio = defesaContraNavio;
    }

    public double getDefesaContraSubmarino() {
        return defesaContraSubmarino;
    }

    public void setDefesaContraSubmarino(double defesaContraSubmarino) {
        this.defesaContraSubmarino = defesaContraSubmarino;
    }

    public double getDefesaContraEdificio() {
        return defesaContraEdificio;
    }

    public void setDefesaContraEdificio(double defesaContraEdificio) {
        this.defesaContraEdificio = defesaContraEdificio;
    }

    @Override
    public String toString() {
        return "Defesa{" +
                "defesaSemBlindagem=" + defesaSemBlindagem +
                ", defesaContraBlindagemLeve=" + defesaContraBlindagemLeve +
                ", defesaContraBlindagemPessada=" + defesaContraBlindagemPessada +
                ", defesaContraAviao=" + defesaContraAviao +
                ", defesaContraNavio=" + defesaContraNavio +
                ", defesaContraSubmarino=" + defesaContraSubmarino +
                ", defesaContraEdificio=" + defesaContraEdificio +
                '}';
    }
}
