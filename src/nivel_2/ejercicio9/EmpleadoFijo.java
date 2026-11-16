package nivel_2.ejercicio9;

public class EmpleadoFijo extends Empleado implements Descontable {

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

    @Override
    public double calculadoraDescuento(double porcentaje) {
       double valor = salarioBase*porcentaje/100;
        return valor;
    }
}
