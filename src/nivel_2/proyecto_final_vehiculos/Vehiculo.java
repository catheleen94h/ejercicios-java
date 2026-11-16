package nivel_2.proyecto_final_vehiculos;

public abstract class Vehiculo {

    //atributos
    private String marca;
    private String modelo;
    private int anio;
    private double precio;

    //constructor
    public Vehiculo(String marca, String modelo, int anio, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    //metodos

    public abstract double calcularPrecioVenta();

    public void mostrarInformacion(){
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Año: "+ anio);
        System.out.println("Precio: "+precio);
    };

    //getters

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public double getPrecio() {
        return precio;
    }
}
