package nivel_3;

public class Ejemplo2 {

    public static void main(String[] args) {

        System.out.println("Inicio del programa");

        try {
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre cero");
        }

        System.out.println("Fin del programa");
    }
}