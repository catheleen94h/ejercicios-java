package nivel_1;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       System.out.println(" -- Ejercicio 1 --");

        System.out.print("Ingrese nombre del usuario: ");
        String nombre = scanner.nextLine();

        if(nombre.isBlank()){
            System.out.println("El nombre es obligatorio");
        }else{
            System.out.println("Nombre: "+nombre);
        }

        System.out.println(" -- Ejercicio 2 --");

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        if(edad<0){
            System.out.println("Edad inválida");
        } else if (edad>=0 && edad<=17) {
            System.out.println("Menor de edad");
        }else{System.out.println("Mayor de edad");}

        System.out.println(" -- Ejercicio 3 --");
        System.out.print("Ingrese el email del usuario: ");
        String email = scanner.nextLine();


        if(email.contains("@")&&email.contains(".")){
            System.out.println("Correo Válido");
        }else{
            System.out.println("Correo inválido");
        }


        System.out.println(" -- Ejercicio 4 --");

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("ingrese la cantidad: ");
        int cantidad = scanner.nextInt();

        validacion(cantidad,precio);

        System.out.println(" -- Ejercicio 5 --");

        System.out.print("Ingrese la cantidad de usuarios a registrar: ");
        int qty = scanner.nextInt();
        scanner.nextLine();

        for(int i=1; i<=qty; i++){

            System.out.print("Ingrese nombre del usuario: ");
            String nombre2 = scanner.nextLine();

            System.out.print("Ingrese el email del usuario: ");
            String email2 = scanner.nextLine();

            System.out.print("Ingrese su edad: ");
            int edad2 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("  -----  ");
            System.out.println("Usuario: "+i);

            if(nombre2.isBlank()){
                System.out.println("Nombre: Invalido"); }
            else{
                System.out.println("Nombre: "+ nombre2);
            }

            if(edad2<0){
                System.out.println("Edad: inválida");}
            else{
                System.out.println("Edad: "+ edad2);
            }

            if(email2.contains("@")&&email2.contains(".")){
                System.out.println("Correo: "+ email2);
            }else{
                System.out.println("Correo: inválido");
            }
            System.out.println("  -----  ");
        }




        scanner.close();
    }

    public static void validacion (int cantidad, double precio) {
        if(cantidad>0 && precio>0){
            System.out.println("Total: " + cantidad*precio);
        }else if(cantidad<=0&& precio>0){
            System.out.println("Cantidad debe ser mayor a 0");
        }else if(cantidad>0 && precio<=0){
            System.out.println("Precio debe ser mayor a 0");
        }else if(cantidad<=0 && precio<=0){
            System.out.println("La cantidad y el precio deben ser mayor a 0");
        }
    }
}