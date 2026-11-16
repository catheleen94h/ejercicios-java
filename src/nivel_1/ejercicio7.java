package nivel_1;// sistema de inventario

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese nombre del producto: ");
        String producto = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("ingrese la cantidad: ");
        int cantidad = scanner.nextInt();

        if (esPrecioValido(precio)) {

            double total = calcularTotal(precio, cantidad);

            mostrarProducto(producto, precio, cantidad, total);

        } else {

            System.out.println("Precio inválido");

        }


        scanner.close();
    }
    public static double calcularTotal(double precio, int cantidad){
        return precio * cantidad;
    }
    public static boolean esPrecioValido(double precio){
        return precio>0;
    }
    public static void mostrarProducto(String nombre, double precio, int cantidad, double total){
        System.out.println(" ----- ");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Precio: "+ precio);
        System.out.println("Cantidad: "+ cantidad);
        System.out.println("total: "+total);
    }

}
