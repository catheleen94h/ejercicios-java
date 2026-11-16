package nivel_2.ejercicio3;

public class Producto {
    // atributos

     String nombre;
     double precio;
     int cantidad;

    //constructor


    public Producto() {
    }

    public Producto(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }


    //metodos

    public void mostrarProducto(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Subtotal: "+ calcularSubtotal());
        System.out.println();
    }

    public double calcularSubtotal(){
        return cantidad*precio;
    }

    public void mostrarDatos() {
        System.out.println(nombre);
        System.out.println(precio);
        System.out.println(cantidad);
    }

}
