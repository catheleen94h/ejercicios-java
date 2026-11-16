package nivel_3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese primer número: ");
            int a = scanner.nextInt();


            System.out.println("Ingrese segundo número: ");
            int b = scanner.nextInt();


            if (b == 0) {
                throw new ArithmeticException();
            }

            double div = (double) a / b;

            System.out.println("Resultado: "+ div);

            scanner.close();

        }catch (ArithmeticException e){
            System.out.println("No se puede dividir entre cero");


        } finally {
            System.out.println("Operación finalizada");
        }


    }
}
