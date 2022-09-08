import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Cine cine = new Cine();
        //TODO: implementar menu
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Gestión de salas");
            System.out.println("(1) Registrar Sala");
            System.out.println("(2) Mostrar Salas");
            System.out.println("(3) Registrar Función");
            System.out.println("(4) Registrar Venta");
            System.out.print("Ingrese la opción: ");
            String opcion = sc.nextLine();
            switch (opcion) {
                case "1" -> {
                    System.out.println("Registro de sala");
                    System.out.print("Ingrese el tipo de sala (1: película, 2: presentación): ");
                    String tipoSala = sc.nextLine();
                    switch (tipoSala) {
                        case "1" -> cine.registrarSalaPelicula();
                        case "2" -> cine.registrarSalaPresentacion();
                    }
                }
                case "2" -> cine.mostrarSalas();

                case "3" -> {

                }
                case "4" -> {

                }
            }
        }
    }
}