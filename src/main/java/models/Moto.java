package models;

import interfaces.Combustible;

public class Moto extends Vehiculo implements Combustible {
    private double nivelCombustible;
    private static final String TIPO_COMBUSTIBLE = "Gasolina";

    public Moto(String marca, String modelo) {
        super(marca, modelo);
        this.nivelCombustible = 0;
    }

    @Override
    public void mover() {
        if (nivelCombustible > 0) {
            System.out.println("La moto " + marca + " " + modelo + " se desplaza ágilmente por el tráfico.");
            nivelCombustible -= 2;
        } else {
            System.out.println("La moto " + marca + " " + modelo + " no puede moverse sin combustible.");
        }
    }

    @Override
    public void recargar(double cantidad) {
        nivelCombustible += cantidad;
        System.out.println("Recargando " + cantidad + " litros de " + TIPO_COMBUSTIBLE +
                " en la moto " + marca + " " + modelo);
    }

    @Override
    public String getTipoCombustible() {
        return TIPO_COMBUSTIBLE;
    }

    public double getNivelCombustible() {
        return nivelCombustible;
    }

    public void hacerCaballito() {
        System.out.println("La moto " + marca + " " + modelo + " está haciendo un caballito.");
    }
}