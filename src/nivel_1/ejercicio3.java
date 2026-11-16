package nivel_1;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese el id: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("ingrese el nombre del usuario: ");
        String nombre = scanner.nextLine();

        System.out.print("ingrese el correo electrónico: ");
        String correo = scanner.nextLine();

        System.out.print("ingrese la edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("estado de la cuenta: ");
        boolean estado = scanner.nextBoolean();
        scanner.nextLine();

        System.out.print("Id del usuario: "+ id);
        System.out.print("\nNombre: "+ nombre);
        System.out.print("\nCorreo: "+ correo);
        System.out.print("\nEdad: "+ edad);
        System.out.print("\nEstado true o false: "+ estado);

        scanner.close();

    }

}
