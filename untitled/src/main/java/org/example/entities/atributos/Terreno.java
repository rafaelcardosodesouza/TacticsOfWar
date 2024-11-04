package org.example.entities.atributos;

public class Terreno {
    private double efeitoTerrenoPlanice[] = new double[3]; //vida | velocidade | força
    private double efeitoTerrenoColinas[] = new double[3]; //vida | velocidade | força
    private double efeitoTerrenomontanha[] = new double[3]; //vida | velocidade | força
    private double efeitoTerrenoFloresta[] = new double[3]; //vida | velocidade | força
    private double efeitoTerrenoUrbana[] = new double[3]; //vida | velocidade | força
    private double efeitoTerrenoMar[] = new double[3]; //vida | velocidade | força

    public Terreno(double[] efeitoTerrenoPlanice, double[] efeitoTerrenoColinas, double[] efeitoTerrenomontanha, double[] efeitoTerrenoFloresta, double[] efeitoTerrenoUrbana, double[] efeitoTerrenoMar) {
        this.efeitoTerrenoPlanice = efeitoTerrenoPlanice;
        this.efeitoTerrenoColinas = efeitoTerrenoColinas;
        this.efeitoTerrenomontanha = efeitoTerrenomontanha;
        this.efeitoTerrenoFloresta = efeitoTerrenoFloresta;
        this.efeitoTerrenoUrbana = efeitoTerrenoUrbana;
        this.efeitoTerrenoMar = efeitoTerrenoMar;
    }

    public double[] getEfeitoTerrenoPlanice() {
        return efeitoTerrenoPlanice;
    }

    public void setEfeitoTerrenoPlanice(double[] efeitoTerrenoPlanice) {
        this.efeitoTerrenoPlanice = efeitoTerrenoPlanice;
    }

    public double[] getEfeitoTerrenoColinas() {
        return efeitoTerrenoColinas;
    }

    public void setEfeitoTerrenoColinas(double[] efeitoTerrenoColinas) {
        this.efeitoTerrenoColinas = efeitoTerrenoColinas;
    }

    public double[] getEfeitoTerrenomontanha() {
        return efeitoTerrenomontanha;
    }

    public void setEfeitoTerrenomontanha(double[] efeitoTerrenomontanha) {
        this.efeitoTerrenomontanha = efeitoTerrenomontanha;
    }

    public double[] getEfeitoTerrenoFloresta() {
        return efeitoTerrenoFloresta;
    }

    public void setEfeitoTerrenoFloresta(double[] efeitoTerrenoFloresta) {
        this.efeitoTerrenoFloresta = efeitoTerrenoFloresta;
    }

    public double[] getEfeitoTerrenoUrbana() {
        return efeitoTerrenoUrbana;
    }

    public void setEfeitoTerrenoUrbana(double[] efeitoTerrenoUrbana) {
        this.efeitoTerrenoUrbana = efeitoTerrenoUrbana;
    }

    public double[] getEfeitoTerrenoMar() {
        return efeitoTerrenoMar;
    }

    public void setEfeitoTerrenoMar(double[] efeitoTerrenoMar) {
        this.efeitoTerrenoMar = efeitoTerrenoMar;
    }
}
