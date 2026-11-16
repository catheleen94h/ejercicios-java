package nivel_2.ejercicio5;

public class ProductoFisico extends Producto {

     private double peso;


    //metodo
    public void mostrarPeso(){
        System.out.println("Peso: "+peso+ " Kg");
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
