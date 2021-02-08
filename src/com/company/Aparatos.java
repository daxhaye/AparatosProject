package com.company;

public class Aparatos {
    private boolean encendido;
    private boolean esCritico;
    private int consumo;

    public Aparatos(boolean encendido, boolean esCritico, int consumo) {
        this.encendido = encendido;
        this.esCritico = esCritico;
        this.consumo = consumo;
    }

    public boolean esCritico() {
        return esCritico;
    }

    public void setEsCritico(boolean esCritico) {
        this.esCritico = esCritico;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }
}
