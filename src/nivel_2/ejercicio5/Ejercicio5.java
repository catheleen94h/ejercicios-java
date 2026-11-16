package nivel_2.ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {

        ProductoFisico productoFisico1 = new ProductoFisico();
        productoFisico1.nombre = "Paquete de arroz";
        productoFisico1.precio = 8500;
        productoFisico1.setPeso(1.5);

        productoFisico1.mostrarInformacion();
        productoFisico1.mostrarPeso();

    }
}
