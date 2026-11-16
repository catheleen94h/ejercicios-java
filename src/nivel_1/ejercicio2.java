package nivel_1;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre del producto: ");
        String producto = scanner.nextLine();

        System.out.print("Ingresa el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Cantidad disponible: ");
        int cantidad = scanner.nextInt();

        if (precio > 0 && cantidad >= 0) {

            double valor = precio * cantidad;

            System.out.println("\n--- INVENTARIO ---");
            System.out.println("Producto: " + producto);
            System.out.println("Precio: $" + precio);
            System.out.println("Cantidad: " + cantidad);

            System.out.printf("Valor total: $%.2f%n", valor);

        } else {

            System.out.println("Error: precio o cantidad no validos.");

        }

        scanner.close();
    }
}
