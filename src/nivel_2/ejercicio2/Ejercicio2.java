package nivel_2.ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args){

        double totalCompra;

        Producto producto1 = new Producto();

        producto1.nombre = "Paquete manzana";
        producto1.cantidad = 2;
        producto1.precio = 15000;

        //producto1.mostrarProducto();
        double subtotal1 = producto1.calcularSubtotal();
        //System.out.println("Subtotal: " + subtotal1);

        Producto producto2 = new Producto();

        producto2.nombre = "Uva chilena";
        producto2.cantidad = 1;
        producto2.precio= 10000;

        //producto2.mostrarProducto();
        double subtotal2 = producto2.calcularSubtotal();
        //System.out.println("Subtotal: " + subtotal2);


        Producto producto3 = new Producto();

        producto3.nombre = "Paquete de arroz";
        producto3.cantidad = 3;
        producto3.precio= 8500;

        //producto3.mostrarProducto();
        double subtotal3 = producto3.calcularSubtotal();
        //System.out.println("Subtotal: " + subtotal3);


        System.out.println("===========================");
        System.out.println("     RESUMEN DE COMPRA     ");
        System.out.println("===========================");
        System.out.println();
        comprados(producto1.nombre, subtotal1);
        comprados(producto2.nombre, subtotal2);
        comprados(producto3.nombre,subtotal3);
        totalCompra=calcularTotal(subtotal1,subtotal2,subtotal3);
        System.out.println("===========================");
        System.out.println("TOTAL DE LA COMPRA: "+ totalCompra);
    }
    public static double calcularTotal(double subtotal1, double subtotal2, double subtotal3) {
       return subtotal1+subtotal2+subtotal3;
    }

    public static void comprados(String nombre, double subtotal){
        System.out.println("Producto: "+ nombre);
        System.out.println("Subtotal: "+ subtotal);
        System.out.println();
    }

}
