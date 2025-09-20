import models.Vehiculo;
import models.Carro;
import models.Moto;
import models.Camion;
import interfaces.Combustible;

public class Main {
    public static void main(String[] args) {
        // Crear un arreglo polimórfico de Vehiculo
        Vehiculo[] vehiculos = {
                new Carro("Toyota", "Corolla"),
                new Moto("Yamaha", "MT-07"),
                new Camion("Volvo", "FH16", 20.5),
                new Carro("Honda", "Civic"),
                new Moto("Kawasaki", "Ninja")
        };

        System.out.println("=== DEMOSTRACIÓN DE POLIMORFISMO CON VEHÍCULOS ===\n");

        // Iterar a través del arreglo y llamar al método mover() polimórficamente
        System.out.println("--- Moviendo todos los vehículos ---");
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mover();
        }

        System.out.println("\n--- Recargando vehículos con combustible ---");
        // Identificar y recargar vehículos que implementan Combustible
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof Combustible) {
                Combustible vehiculoCombustible = (Combustible) vehiculo;
                vehiculoCombustible.recargar(50);
                System.out.println("Tipo de combustible: " + vehiculoCombustible.getTipoCombustible());
            }
        }

        System.out.println("\n--- Moviendo vehículos después de recargar ---");
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mover();
        }

        System.out.println("\n--- Invocando métodos específicos de cada tipo ---");
        // Demostración de downcasting para métodos específicos
        for (Vehiculo vehiculo : vehiculos) {
            System.out.print(vehiculo.getMarca() + " " + vehiculo.getModelo() + ": ");

            if (vehiculo instanceof Carro) {
                ((Carro) vehiculo).abrirMaletero();
            } else if (vehiculo instanceof Moto) {
                ((Moto) vehiculo).hacerCaballito();
            } else if (vehiculo instanceof Camion) {
                ((Camion) vehiculo).cargarMercancia();
            }
        }

        // Estadísticas
        System.out.println("\n=== ESTADÍSTICAS ===");
        int carros = 0, motos = 0, camiones = 0;

        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof Carro) carros++;
            else if (vehiculo instanceof Moto) motos++;
            else if (vehiculo instanceof Camion) camiones++;
        }

        System.out.println("Total de vehículos: " + vehiculos.length);
        System.out.println("Carros: " + carros);
        System.out.println("Motos: " + motos);
        System.out.println("Camiones: " + camiones);
    }
}