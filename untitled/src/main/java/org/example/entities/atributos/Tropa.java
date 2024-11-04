package org.example.entities.atributos;

public class Tropa {

    private Defesa defesa;
    private Recursos recursos;
    private Dano dano;
    private Terreno terreno;

    public Tropa() {

    }
    public Tropa(Defesa defesa, Recursos recursos, Dano dano, Terreno terreno) {
        this.defesa = defesa;
        this.recursos = recursos;
        this.dano = dano;
        this.terreno = terreno;
    }

    public Defesa getDefesa() {
        return defesa;
    }

    public void setDefesa(Defesa defesa) {
        this.defesa = defesa;
    }

    public Recursos getRecursos() {
        return recursos;
    }

    public void setRecursos(Recursos recursos) {
        this.recursos = recursos;
    }

    public Dano getDano() {
        return dano;
    }

    public void setDano(Dano dano) {
        this.dano = dano;
    }

    public Terreno getTerreno() {
        return terreno;
    }

    public void setTerreno(Terreno terreno) {
        this.terreno = terreno;
    }
}
