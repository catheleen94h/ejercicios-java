package nivel_2.ejercicio3;


public class Ejercicio3 {
    public static void main(String[] args){

        double totalCompra;
        double subtotal1;
        double subtotal2;
        double subtotal3;

        //creamos objetos

        Producto producto1 = new Producto("Paquete de manzanas",15000,2);
        Producto producto2 = new Producto("Uva chilena", 12000,4);
        Producto producto3 = new Producto("Arroz",1500,10);

        subtotal1 = producto1.calcularSubtotal();
        subtotal2 = producto2.calcularSubtotal();
        subtotal3 = producto3.calcularSubtotal();

        totalCompra= calcularTotal(subtotal1,subtotal2,subtotal3);

        System.out.println("============== RESUMEN DE COMPRA==============");
        producto1.mostrarProducto();
        producto2.mostrarProducto();
        producto3.mostrarProducto();
        System.out.println("==============================================");
        System.out.println("Total compra: " + totalCompra);


    }

    public static double calcularTotal(double subtotal1,double subtotal2,double subtotal3){
        return subtotal1 + subtotal2 + subtotal3;
    }

}
