package nivel_2.ejercicio8;

public class Ejercicio8 {
    public static void main(String[] args){

        Empleado empleado1 = new EmpleadoFijo("Carlos",2000000,300000);
        Empleado empleado2 = new EmpleadoPorComision("Laura", 1500000,500000);

        System.out.println("=====================");
        System.out.println("      EMPLEADOS      ");
        System.out.println("=====================");
        empleado1.mostrarDatos();
        empleado2.mostrarDatos();



    }
}
