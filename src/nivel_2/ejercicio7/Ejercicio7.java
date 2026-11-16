package nivel_2.ejercicio7;

public class Ejercicio7 {
    public static void main(String[] args){

       /*
        MOSTRAMOS POLIMORFISMO
        producto1 contiene un objeto ProductoFisico, por eso ejecuta el mostrarInformacion() de ProductoFisico.
        producto2 contiene un objeto ProductoDigital, por eso ejecuta el mostrarInformacion() de ProductoDigital.
        */

        Producto producto1 = new ProductoFisico("Computador portatil ASUS",3500000, 0.5);

        Producto producto2 = new ProductoDigital("Cien años de soledad",120000, 320);

        producto1.mostrarInformacion();
        producto2.mostrarInformacion();
    }
}
