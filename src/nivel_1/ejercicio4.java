package nivel_1;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el Id del usuario: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el nombre del usuario: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del usuario: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("estado de la cuenta true o false: ");
        String estado = scanner.nextLine();

        String estados = estado.equalsIgnoreCase("true") ? "Activo" : "No activo";

        String registro;
        if((edad>=18) &&(estados.equals("Activo"))){registro= "Registro permitido";}
         else if((edad>=18) &&(estados.equals("No activo"))){registro= "Cuenta deshabilitada";}
            else{registro="No puede registrarse";}



        System.out.print(" -- RELSULTADO --");
        System.out.println("Usuario: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Estado: "+ estados);
        System.out.println("Resultado: "+ registro);

        scanner.close();
    }

}
