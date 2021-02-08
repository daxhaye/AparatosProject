package com.company;

import java.util.ArrayList;

public class Red {
    private ArrayList<Aparatos> aparatosList;
    private int maxEnergia;

    public Red(int maxEnergia) {

        this.aparatosList = new ArrayList<Aparatos>();
        this.maxEnergia = maxEnergia;
    }

    public void addRed(Aparatos ap) {
        this.aparatosList.add(ap);
    }

    public void sistemaSeguridad() {
        int i = 0;

        while(this.getMaxEnergia() < this.apConsumo() && i < this.aparatosList.size()) {
            if(!this.aparatosList.get(i).esCritico()) {
                this.aparatosList.get(i).setEncendido(false);
            }
            i++;
        }

        if (this.getMaxEnergia() < this.apConsumo()) {
            System.out.println("Sistema de Alarma activado!!!!");
        }
    }

    private int getMaxEnergia() {
        return maxEnergia;
    }

    private int apConsumo() {
        int result = 0;
        for(Aparatos ap : this.aparatosList) {
            if(ap.isEncendido()){
                result += ap.getConsumo();
            }
        }

        return result;
    }

}
