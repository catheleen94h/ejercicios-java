package nivel_2.ejercicio8;

public class EmpleadoFijo extends Empleado {

    private final double bonificacion;

    //constructor
    public EmpleadoFijo(String nombre, double salarioBase, double bonificacion) {
        super(nombre, salarioBase);
        this.bonificacion = bonificacion;
    }

    //metodos

    @Override
    public double calcularSalario() {
        return salarioBase+bonificacion;
    }
}
