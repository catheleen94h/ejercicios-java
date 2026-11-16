package nivel_2.proyecto_final_vehiculos;


public class Concesionario {

    // Atributos
    private Vehiculo vehiculo1;
    private Vehiculo vehiculo2;
    private Vehiculo vehiculo3;
    private Vehiculo vehiculo4;
    private Vehiculo vehiculo5;
    private Vehiculo vehiculo6;

    // Registrar los seis vehículos
    public void registrarVehiculos(
            Vehiculo vehiculo1,
            Vehiculo vehiculo2,
            Vehiculo vehiculo3,
            Vehiculo vehiculo4,
            Vehiculo vehiculo5,
            Vehiculo vehiculo6) {

        this.vehiculo1 = vehiculo1;
        this.vehiculo2 = vehiculo2;
        this.vehiculo3 = vehiculo3;
        this.vehiculo4 = vehiculo4;
        this.vehiculo5 = vehiculo5;
        this.vehiculo6 = vehiculo6;
    }

    // Mostrar información de todos los vehículos
    public void mostrarVehiculos() {

        System.out.println("===== VEHICULOS DEL CONCESIONARIO =====");

        vehiculo1.mostrarInformacion();
        vehiculo2.mostrarInformacion();
        vehiculo3.mostrarInformacion();
        vehiculo4.mostrarInformacion();
        vehiculo5.mostrarInformacion();
        vehiculo6.mostrarInformacion();
    }

    // Mostrar precio base y precio de venta
    public void mostrarPreciosVenta() {

        System.out.println("===== PRECIOS DE VENTA =====");

        mostrarPrecio(vehiculo1);
        mostrarPrecio(vehiculo2);
        mostrarPrecio(vehiculo3);
        mostrarPrecio(vehiculo4);
        mostrarPrecio(vehiculo5);
        mostrarPrecio(vehiculo6);
    }

    // Método auxiliar para evitar repetir código
    private void mostrarPrecio(Vehiculo vehiculo) {

        System.out.println("Modelo: " + vehiculo.getModelo());
        System.out.println("Precio base: " + vehiculo.getPrecio());
        System.out.println("Precio de venta: " + vehiculo.calcularPrecioVenta());
        System.out.println();
    }

    // Buscar vehículo por modelo
    public void buscarVehiculo(String modelo) {

        boolean encontrado = false;

        if (vehiculo1.getModelo().equalsIgnoreCase(modelo)) {
            vehiculo1.mostrarInformacion();
            encontrado = true;
        }

        if (vehiculo2.getModelo().equalsIgnoreCase(modelo)) {
            vehiculo2.mostrarInformacion();
            encontrado = true;
        }

        if (vehiculo3.getModelo().equalsIgnoreCase(modelo)) {
            vehiculo3.mostrarInformacion();
            encontrado = true;
        }

        if (vehiculo4.getModelo().equalsIgnoreCase(modelo)) {
            vehiculo4.mostrarInformacion();
            encontrado = true;
        }

        if (vehiculo5.getModelo().equalsIgnoreCase(modelo)) {
            vehiculo5.mostrarInformacion();
            encontrado = true;
        }

        if (vehiculo6.getModelo().equalsIgnoreCase(modelo)) {
            vehiculo6.mostrarInformacion();
            encontrado = true;
        }

        if (!encontrado) {
            System.out.println("No se encontro el vehiculo: " + modelo);
        }
    }
}

