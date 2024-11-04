package org.example.entities.atributos;

public class Recursos {
    private double valor;
    private double vida;
    private int velocidade;
    private int alimento;
    private int maoDeObra;
    private int combustivel;
    private double valorDiario;
    private int alimentoDiario;
    private int maoDeObraDiario;
    private int combustivelDiario;

    public Recursos(double valor, double vida, int velocidade, int alimento, int maoDeObra, int combustivel, double valorDiario, int alimentoDiario, int maoDeObraDiario, int combustivelDiario) {
        this.valor = valor;
        this.vida = vida;
        this.velocidade = velocidade;
        this.alimento = alimento;
        this.maoDeObra = maoDeObra;
        this.combustivel = combustivel;
        this.valorDiario = valorDiario;
        this.alimentoDiario = alimentoDiario;
        this.maoDeObraDiario = maoDeObraDiario;
        this.combustivelDiario = combustivelDiario;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getAlimento() {
        return alimento;
    }

    public void setAlimento(int alimento) {
        this.alimento = alimento;
    }

    public int getMaoDeObra() {
        return maoDeObra;
    }

    public void setMaoDeObra(int maoDeObra) {
        this.maoDeObra = maoDeObra;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }

    public double getValorDiario() {
        return valorDiario;
    }

    public void setValorDiario(double valorDiario) {
        this.valorDiario = valorDiario;
    }

    public int getAlimentoDiario() {
        return alimentoDiario;
    }

    public void setAlimentoDiario(int alimentoDiario) {
        this.alimentoDiario = alimentoDiario;
    }

    public int getMaoDeObraDiario() {
        return maoDeObraDiario;
    }

    public void setMaoDeObraDiario(int maoDeObraDiario) {
        this.maoDeObraDiario = maoDeObraDiario;
    }

    public int getCombustivelDiario() {
        return combustivelDiario;
    }

    public void setCombustivelDiario(int combustivelDiario) {
        this.combustivelDiario = combustivelDiario;
    }
}
