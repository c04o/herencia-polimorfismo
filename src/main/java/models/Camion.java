package models;

public class Camion extends Vehiculo {
    private double capacidadCarga;

    public Camion(String marca, String modelo, double capacidadCarga) {
        super(marca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void mover() {
        System.out.println("El camión " + marca + " " + modelo + " transporta carga pesada por la autopista.");
    }

    public void cargarMercancia() {
        System.out.println("Cargando " + capacidadCarga + " toneladas en el camión " + marca + " " + modelo);
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }
}