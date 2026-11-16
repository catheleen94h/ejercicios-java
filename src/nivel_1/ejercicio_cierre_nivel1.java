package nivel_1;

import java.util.Scanner;

public class ejercicio_cierre_nivel1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese la cantidad de usuarios a registrar: ");
        int qty = scanner.nextInt();
        scanner.nextLine();


        for(int i=1; i<=qty; i++){
        System.out.print("Ingrese nombre del usuario: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el email del usuario: ");
        String email = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();


        boolean ok = validaciones(nombre, edad, email);

        if (ok) {
            mostrar(i,nombre, edad, email);
        } else {
            System.out.println("  ----------   ");
            System.out.println("El usuario no puede registrarse");
            System.out.println("  ----------   ");
        }

    }

       scanner.close();

    }
    public static void mostrar(int i, String nombre, int edad, String correo){
        System.out.println("  ----------   ");
        System.out.println("Usuario:" + i);
        System.out.println("Nombre:" + nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Corre: "+ correo);
        System.out.println("  ----------   ");

    }

    public static boolean validaciones(String nombre, int edad, String correo){
        int a = nombre.isBlank() ? 1 : 0;
        int b = edad<0 ? 1 :0;
        int c= correo.contains("@")&&correo.contains(".") ? 0 : 1;
        return (a+b+c) == 0;
    }

}
