package models;

public class Carro extends Vehiculo {

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("El carro " + marca + " " + modelo + " se desplaza por la carretera.");
    }

    public void abrirMaletero() {
        System.out.println("Abriendo el maletero del carro " + marca + " " + modelo);
    }
}