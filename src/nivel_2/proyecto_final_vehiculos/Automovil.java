package nivel_2.proyecto_final_vehiculos;

public class Automovil extends Vehiculo{
    
    //atributos
    private int numeroPuertas;

    public Automovil(String marca, String modelo, int anio, double precio, int numeroPuertas) {
        super(marca, modelo, anio, precio);
        this.numeroPuertas = numeroPuertas;
    }


    @Override
    public double calcularPrecioVenta() {
        return getPrecio() * 1.05;
        
    }

    //getters


    public int getNumeroPuertas() {
        return numeroPuertas;
    }
}
