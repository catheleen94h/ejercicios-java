package nivel_2.ejercicio7;

public class Producto {

    //atributos
    protected String nombre;
    protected double precio;

    //constructor

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    //metodos

    public void mostrarInformacion(){
        System.out.println();
        System.out.println("Nombre: "+ nombre);
        System.out.println("Precio: "+ precio);

    }





}
