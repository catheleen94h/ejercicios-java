package nivel_2.proyecto_final_vehiculos;

public class AutomovilElectrico extends Vehiculo implements Electrico{

    private double capacidadBateria;
    private double consumoPorKm;

    public AutomovilElectrico(String marca, String modelo, int anio, double precio, double capacidadBateria, double consumoPorKm) {
        super(marca, modelo, anio, precio);
        this.capacidadBateria = capacidadBateria;
        this.consumoPorKm = consumoPorKm;
    }

    @Override
    public double calcularAutonomia() {
        return capacidadBateria/consumoPorKm;
    }


    @Override
    public void mostrarBateria() {
        System.out.println("Capacidad de bateria: "+ capacidadBateria);
    }

    @Override
    public double calcularPrecioVenta() {
        return getPrecio()*1.10;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Capacidad de bateria: "+ capacidadBateria);
        System.out.println("Consumo por kilometro: "+ consumoPorKm);
        System.out.println("Autonomia: "+ calcularAutonomia());
    }





}
