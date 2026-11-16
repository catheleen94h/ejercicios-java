package nivel_2.ejercicio7;

public class ProductoFisico extends Producto {

    //atributos
    private final double peso;

    //constructor
    public ProductoFisico(String nombre, double precio, double peso){
        super(nombre,precio);
        this.peso = peso;
    }

    //metodos


    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Peso: "+ peso + "Kg");

    }
}
