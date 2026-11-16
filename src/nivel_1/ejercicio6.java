package nivel_1;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {

        saludar();
        mostrarUsuario("Martha", 32);

        int resultado = sumar(3,2);
        System.out.println("Resultado: "+ resultado);

        boolean mayor = esMayorDeEdad(17);
        System.out.println("Es mayor de edad: "+ mayor);

        double total = calcularTotal(5000,2);
        System.out.println("El total de la compra es: "+ total);

        System.out.println(" -- Ejercicio 6 --");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad1 = scanner.nextInt();
        scanner.nextLine();


        boolean dato = esMayorDeEdad(edad1);
        String mensaje = dato
                ? "Es mayor de edad"
                : "Es menor de edad";

        String permiso = dato
                        ? "Registro permitido"
                        :"Registro rechazado";

        mostrar(nombre,edad1,mensaje,permiso);

        scanner.close();

    }
    public static void mostrar(String nombre, int edad,String mensaje, String permiso){
        System.out.println("---- DATOS ----");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println(mensaje);
        System.out.println(permiso);

    }

    public static void saludar(){
        System.out.println("Bienvenido al sistema de gestión de usuarios");
    }

    public static void mostrarUsuario(String nombre, int edad){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
    }

    public static int sumar(int a, int b){
        return a + b;
    }

    public static boolean esMayorDeEdad(int edad) {
        return edad>=18;
    }

    public static double calcularTotal(double precio, int cantidad){
        return precio * cantidad;
    }

}
