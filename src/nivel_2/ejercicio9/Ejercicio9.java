package nivel_2.ejercicio9;

public class Ejercicio9 {
    public static void main(String[] args){

        ProductoFisico producto = new ProductoFisico("Computador", 3500000, 0.5);

        EmpleadoFijo empleado = new EmpleadoFijo("Carlos", 2000000, 300000);


        double descuento1 =producto.calculadoraDescuento(10);
        producto.mostrarInformacion();
        System.out.println("Descuento: "+descuento1);
        System.out.println();

        double descuento2 = empleado.calculadoraDescuento(10);
        empleado.calculadoraDescuento(10);
        empleado.mostrarDatos();
        System.out.println("Descuento: "+descuento2);


    }
}
