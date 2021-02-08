package com.company;

public class Main {

    public static void main(String[] args) {

        Aparatos computadora = new Aparatos(true, false,300);
        Aparatos television = new Aparatos(true, true,500);
        Aparatos microhondas = new Aparatos(true, true, 1000);
        Aparatos playStation = new Aparatos(true, false, 2550);
        Aparatos xBox360 = new Aparatos(true, false, 1500);

        Red redDomicilio = new Red(1500);

        redDomicilio.addRed(computadora);
        redDomicilio.addRed(television);
        redDomicilio.addRed(microhondas);
        redDomicilio.addRed(playStation);
        redDomicilio.addRed(xBox360);

        redDomicilio.sistemaSeguridad();



    }


}
