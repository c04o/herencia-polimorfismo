import models.Vehiculo;
import models.Carro;
import models.Moto;
import models.Camion;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de cada tipo de vehículo
        Carro carro = new Carro("Toyota", "Corolla");
        Moto moto = new Moto("Yamaha", "MT-07");
        Camion camion = new Camion("Volvo", "FH16", 20.5);

        // Usar polimorfismo con la clase base Vehiculo
        Vehiculo[] vehiculos = {carro, moto, camion};

        // Probar el método mover() en cada vehículo
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mover();
        }

        System.out.println("\n--- Métodos específicos de cada subclase ---");

        // Métodos específicos de cada subclase
        carro.abrirMaletero();
        moto.hacerCaballito();
        camion.cargarMercancia();
    }
}