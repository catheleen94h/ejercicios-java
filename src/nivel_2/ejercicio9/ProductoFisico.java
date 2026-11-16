package nivel_2.ejercicio9;

public class ProductoFisico extends Producto implements Descontable{

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

    @Override
    public double calculadoraDescuento(double porcentaje) {
        double valor = precio*porcentaje/100;
        return valor;
    }
}
