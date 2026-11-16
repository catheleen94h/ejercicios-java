package nivel_2.ejercicio6;

public class ProductoFisico extends Producto {

    private final double peso;

    public ProductoFisico(String nombre, double precio, double peso) {
        super(nombre, precio);
        this.peso = peso;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Peso: "+peso);
    }
}
