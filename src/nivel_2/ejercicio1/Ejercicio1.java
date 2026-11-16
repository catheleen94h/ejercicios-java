package nivel_2.ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {

        Producto usuario1 = new Producto();

        usuario1.nombre = "Martha";
        usuario1.correo = "martha@email.com";
        usuario1.edad = 32;

        usuario1.mostrarDatos();


        Producto usuario2 = new Producto();

        usuario2.nombre = "Carlos";
        usuario2.correo = "carlos@email.com";
        usuario2.edad = 25;

        usuario2.mostrarDatos();

    }
}
