package nivel_2.proyecto_final_vehiculos;

public class Motocicleta extends Vehiculo{

    //atributos
    private int cilindraje;


    public Motocicleta(String marca, String modelo, int anio, double precio, int cilindraje) {
        super(marca, modelo, anio, precio);
        this.cilindraje = cilindraje;
    }

    @Override
    public double calcularPrecioVenta() {
        return getPrecio()*1.08;
    }


    public int getCilindraje() {
        return cilindraje;
    }
}
