package nivel_2.ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) {

        double totalCompra;
        double subtotal1;
        double subtotal2;


        //creacion de objetos

        Producto producto1 = new Producto("Gomitas", 2000, 2);
        Producto producto2 = new Producto("Limón", 500, 10);

        subtotal1 = producto1.calcularSubtotal();
        subtotal2 = producto2.calcularSubtotal();
        totalCompra= calcularTotal(subtotal1,subtotal2);


        System.out.println(" --- ORIGINALES ---");

        mostrar(producto1.getNombre(),producto1.getPrecio(), subtotal1);
        mostrar(producto2.getNombre(),producto2.getPrecio(), subtotal2);
        System.out.println("------------------");
        System.out.println("Total: "+ totalCompra);
        System.out.println();

        producto1.setPrecio(3000);
        producto2.setCantidad(0);

        subtotal1 = producto1.calcularSubtotal();
        subtotal2 = producto2.calcularSubtotal();
        totalCompra= calcularTotal(subtotal1,subtotal2);

        System.out.println(" --- MODIFICADOS ---");
        mostrar(producto1.getNombre(),producto1.getPrecio(), subtotal1);
        mostrar(producto2.getNombre(),producto2.getPrecio(), subtotal2);
        System.out.println("------------------");
        System.out.println("Total: "+ totalCompra);
        System.out.println();
    }

    public static double calcularTotal(double subtotal1,double subtotal2){
        return subtotal1 + subtotal2;
    }

    public static void mostrar(String nombre, double precio, double subtotal){
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Subtotal: "+ subtotal);
        System.out.println();
    }

}
