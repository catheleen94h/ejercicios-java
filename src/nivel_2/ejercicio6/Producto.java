package nivel_2.ejercicio6;

public class Producto {
    // atributos

    protected String nombre;
    protected double precio;

    //constructor
    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }


    //metodo
    public void mostrarInformacion(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Precio: "+ precio);
    }
}
