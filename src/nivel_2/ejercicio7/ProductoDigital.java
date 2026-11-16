package nivel_2.ejercicio7;

public class ProductoDigital extends Producto{

    private final double tamanioArchivo;

    //constructor

    public ProductoDigital(String nombre, double precio, double tamanioArchivo){
        super(nombre,precio);
        this.tamanioArchivo = tamanioArchivo;
    }

    //metodo

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Tamaño del archivo: "+ tamanioArchivo +"Mb");

    }


}
