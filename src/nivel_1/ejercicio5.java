package nivel_1;

import java.util.Objects;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        System.out.println(" -- Ejercicio 1 --");
        for(int i=1; i<=20; i++ ){
            System.out.println(i);
        }

        System.out.println("\n -- Ejercicio 2 --");

        for(int i=0; i<=50; i+=2 ){
            System.out.println(i);
        }

        System.out.println("\n -- Ejercicio 3 --");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de la tabla de multiplicar: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        for(int i=1; i<=10; i++ ){
            System.out.println(numero +" * "+ i+" = "+numero*i);
        }


        System.out.println("\n -- Ejercicio 4 --");



        System.out.print("Ingrese el numero de usuarios: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        for(int j=1; j<=num; j++ ){

            System.out.print("Ingrese el nombre del usuario: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la edad del usuario: ");
            int edad = scanner.nextInt();
            scanner.nextLine();

            System.out.println(" ---------");
            System.out.println("Nombre: "+ nombre);
            System.out.println("Edad: "+ edad);
            System.out.println(" ---------");

        }


        System.out.println("\n -- Ejercicio 5 --");

        String contrasenia;
        do{
            System.out.print("Ingrese su contraseña: ");
            contrasenia = scanner.nextLine();


        }


        while(!Objects.equals(contrasenia, "java123"));

            System.out.println("Acceso permitido");



        scanner.close();

    }
}
