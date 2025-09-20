package models;

public class Automovil extends Vehiculo {

    public Automovil(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("El automóvil " + marca + " " + modelo + " se mueve por carretera.");
    }
}