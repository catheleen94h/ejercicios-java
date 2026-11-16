package nivel_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
  public static void main (String[] args) {
      try {
          Scanner dato = new Scanner(System.in);

          System.out.println("Ingrese el primer número: ");
          int num1 = dato.nextInt();

          System.out.println("Ingrese el segundo número: ");
          int num2 = dato.nextInt();



          System.out.println("Ingrese la operacion que desea realizar: " +
                      "\n1. Suma" +
                      "\n2. Resta " +
                      "\n3. Multiplicación" +
                      "\n4. División");

          int operacion = dato.nextInt();

          switch (operacion){
              case 1:
                  System.out.println("Resultado: "+num1+" + "+num2 +" = "+ suma(num1,num2)); break;
              case 2:
                  System.out.println("Resultado: "+num1+" - "+num2 +" = "+ resta(num1,num2));break;
              case 3:
                  System.out.println("Resultado: "+num1+" * "+num2 +" = "+ multiplicacion(num1,num2));break;
              case 4:
                  if(num2==0){ throw new ArithmeticException();}
                  else{
                     System.out.println("Resultado: "+num1+" / "+num2 +" = "+ division(num1,num2));}break;
              default:
                  System.out.println("Selección invalida");

          }


          dato.close();

      } catch (ArithmeticException e) {
          System.out.println("No se puede dividir por cero");

      } catch (InputMismatchException e){
          System.out.println("Debes ingresar un dato valido");

      }finally {
          System.out.println("Calculadora finalizada");
      }


  }
    public static int suma(int a, int b){
        return a + b;
    }

    public static int resta(int a, int b){
        return a - b;
    }

    public static int multiplicacion(int a, int b){
        return a * b;
    }
    public static double division(int a, int b){
        return (double) a / b;
    }

}
