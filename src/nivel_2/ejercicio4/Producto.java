package nivel_2.ejercicio4;

public class Producto {

    //atributos
   private String nombre;
   private double precio;
   private int cantidad;

    //constructor
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        setPrecio(precio);
        setCantidad(cantidad);
    }
    //metodos
    public double calcularSubtotal(){
        return cantidad * precio;
    }


    //getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio>0){
            this.precio = precio;
        }else{
            System.out.println("El precio debe ser mayor a 0");
        }

    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
       if(cantidad>0){
        this.cantidad = cantidad;
       }else {
           System.out.println("La cantidad debe ser mayor a 0");
       }
    }
}
