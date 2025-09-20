import models.Vehiculo;
import models.Carro;
import models.Moto;
import models.Camion;
import interfaces.Combustible;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de cada tipo de vehículo
        Carro carro = new Carro("Toyota", "Corolla");
        Moto moto = new Moto("Yamaha", "MT-07");
        Camion camion = new Camion("Volvo", "FH16", 20.5);

        // Probar el método mover() en cada vehículo
        System.out.println("--- Probando método mover() ---");
        carro.mover();
        moto.mover();
        camion.mover();

        System.out.println("\n--- Recargando combustible ---");
        carro.recargar(40);
        camion.recargar(100);

        System.out.println("\n--- Probando mover() después de recargar ---");
        carro.mover();
        camion.mover();

        System.out.println("\n--- Mostrando tipo de combustible ---");
        System.out.println("Carro usa: " + carro.getTipoCombustible());
        System.out.println("Camión usa: " + camion.getTipoCombustible());

        System.out.println("\n--- Métodos específicos de cada subclase ---");
        carro.abrirMaletero();
        moto.hacerCaballito();
        camion.cargarMercancia();

        // Polimorfismo con la interfaz Combustible
        System.out.println("\n--- Polimorfismo con interfaz Combustible ---");
        Combustible[] vehiculosCombustible = {carro, camion};

        for (Combustible vehiculo : vehiculosCombustible) {
            System.out.println("Recargando vehículo que usa " + vehiculo.getTipoCombustible());
            vehiculo.recargar(10);
        }
    }
}