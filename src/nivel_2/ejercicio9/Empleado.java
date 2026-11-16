package nivel_2.ejercicio9;

public abstract class Empleado {
    //atributos
    protected String nombre;
    protected double salarioBase;

    //constructor
    public Empleado(String nombre, double salarioBase){
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    //metodos
    public abstract double calcularSalario();

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: "+ calcularSalario());
        System.out.println();
    }
}
