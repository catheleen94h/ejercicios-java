
package nivel_2.proyecto_final_vehiculos;

public class Ejercicio10 {
    public static void main(String[] args) {

        // Crear concesionario
        Concesionario concesionario1 = new Concesionario();

        // Crear dos automóviles
        Automovil automovil1 = new Automovil("Honda", "Chichi", 2026, 68000000, 2);
        Automovil automovil2 = new Automovil("Mazda", "3", 2025, 72000000, 4);

        // Crear dos motocicletas
        Motocicleta motocicleta1 = new Motocicleta("Yamaha", "FZ", 2025, 12000000, 150);
        Motocicleta motocicleta2 = new Motocicleta("Honda", "CBR", 2026, 18000000, 250);

        // Crear dos automóviles eléctricos
        AutomovilElectrico electrico1 = new AutomovilElectrico("Tesla", "Model 3", 2026, 150000000, 75, 0.12);

        AutomovilElectrico electrico2 = new AutomovilElectrico("BYD", "Dolphin", 2025, 95000000, 75, 0.115);

        // Registrar los seis vehículos
        concesionario1.registrarVehiculos(
                automovil1,
                automovil2,
                motocicleta1,
                motocicleta2,
                electrico1,
                electrico2
        );

        // Mostrar todos los vehículos
        concesionario1.mostrarVehiculos();

        // Mostrar precios de venta
        concesionario1.mostrarPreciosVenta();

        // Buscar un vehículo
        concesionario1.buscarVehiculo("Model 3");

        // Mostrar autonomía y batería de los eléctricos
        System.out.println("===== VEHICULOS ELECTRICOS =====");

        electrico1.mostrarBateria();
        System.out.println("Autonomia: " + electrico1.calcularAutonomia() + " km");

        electrico2.mostrarBateria();
        System.out.println("Autonomia: " + electrico2.calcularAutonomia() + " km");
    }
}
