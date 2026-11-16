package nivel_1;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Escribe tu edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Escribe tu ciudad: ");
        String ciudad = scanner.nextLine();

        System.out.print("Escribe tu profesion: ");
        String profesion = scanner.nextLine();

        System.out.print("Estas aprendiendo Java? (si/no): ");
        String aprende = scanner.nextLine();

        boolean estaAprendiendoJava =
                aprende.equalsIgnoreCase("si");

        System.out.println("\n--- INFORMACION PERSONAL ---");

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Profesion: " + profesion);
        System.out.println("Aprendiendo Java: " + estaAprendiendoJava);

        scanner.close();
    }
}
