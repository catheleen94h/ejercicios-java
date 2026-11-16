package nivel_2.ejercicio2;

public class Producto {

    //atributos

    String nombre;
    double precio;
    int cantidad;


    public void mostrarProducto(){
        System.out.println(" \n---- PRODUCTO ----");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Precio: "+ precio);
        System.out.println("Cantidad: "+ cantidad);
    }

    public double calcularSubtotal(){
        return cantidad*precio;
    }



}
