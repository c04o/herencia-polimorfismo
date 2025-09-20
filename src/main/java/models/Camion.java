package models;

import interfaces.Combustible;

public class Camion extends Vehiculo implements Combustible {
    private double capacidadCarga;
    private double nivelCombustible;
    private static final String TIPO_COMBUSTIBLE = "Diésel";

    public Camion(String marca, String modelo, double capacidadCarga) {
        super(marca, modelo);
        this.capacidadCarga = capacidadCarga;
        this.nivelCombustible = 0;
    }

    @Override
    public void mover() {
        if (nivelCombustible > 0) {
            System.out.println("El camión " + marca + " " + modelo + " transporta carga pesada por la autopista.");
            nivelCombustible -= 10;
        } else {
            System.out.println("El camión " + marca + " " + modelo + " no puede moverse sin combustible.");
        }
    }

    @Override
    public void recargar(double cantidad) {
        nivelCombustible += cantidad;
        System.out.println("Recargando " + cantidad + " litros de " + TIPO_COMBUSTIBLE +
                " en el camión " + marca + " " + modelo);
    }

    @Override
    public String getTipoCombustible() {
        return TIPO_COMBUSTIBLE;
    }

    public double getNivelCombustible() {
        return nivelCombustible;
    }

    public void cargarMercancia() {
        System.out.println("Cargando " + capacidadCarga + " toneladas en el camión " + marca + " " + modelo);
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }
}