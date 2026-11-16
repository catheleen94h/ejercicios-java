package nivel_3;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio2 {
    public static void main(String[] args){

        Map<String, String> usuarios = new HashMap<>();

        usuarios.put("Carlos", "carlos@gmail.com");
        usuarios.put("Laura", "laura@gmail.com");
        usuarios.put("Juan", "Juan@gmail.com");

        System.out.println("Usuarios: "+ usuarios);

        System.out.println(usuarios.get("Carlos"));
        System.out.println(usuarios.get("Laura"));
        System.out.println(usuarios.get("Juan"));

        System.out.println(usuarios.containsKey("Andres"));

        usuarios.remove("Laura");
        System.out.println("Cantidad de usuarios: "+ usuarios.size());
    }



}
