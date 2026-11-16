package nivel_2.ejercicio8;

public class EmpleadoPorComision extends Empleado{
    //atributos
    private final double comision;

    //constructor
    public EmpleadoPorComision(String nombre, double salarioBase, double comision){
        super(nombre,salarioBase);
        this.comision = comision;
    }

    //metodos
    @Override
    public double calcularSalario(){
        return salarioBase+comision;
    }
}
