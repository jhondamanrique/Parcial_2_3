
import java.util.Scanner;
import java.util.Stack;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validaciones v = new Validaciones();
        Metodo m = new Metodo();
        Stack<Dato> pila = new Stack<>();
        boolean seguir = true;
        int opt = 0;
        int n = 0;

            while (seguir) {
                System.out.println("--------------------------------------------");
                System.out.println("Bienvenido al menu de la pila");
                System.out.println("1) Llenar la pila");
                System.out.println("2) Mostrar la pila");
                System.out.println("3) Validar y reemplazar valores en la pila");
                System.out.println("4) Salir");
                System.out.println("Seleccione una opcion: ");
                opt = v.ValidarEntero(sc);
                
                switch (opt) {
                    case 1: 
                    System.out.println("Ingrese el numero de elementos a ingresar en la pila: ");
                    n = v.ValidarEntero(sc);

                    pila = m.LlenarPila(pila, n);
                    System.out.println("Pila llenada exitosamente.");
                    break;
                    case 2:
                    if (pila.isEmpty()) {
                        System.out.println("La pila está vacía.");
                    } else {
                        System.out.println("Elementos en la pila:");
                        m.MostrarPila(pila);
                    }
                    break;
                    case 3: 
                    if (pila.isEmpty()) {
                        System.out.println("La pila está vacía. debes llenarla antes de validar y reemplazar valores.");
                    } else {
                        pila = m.ValidarReemplazar(pila);
                        System.out.println("Valores validados y reemplazados exitosamente.");
                        System.out.println("Nueva pila:");
                        m.MostrarPila(pila);
                    }
                    break;
                    case 4: 
                    seguir = false;
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                    default:
                    System.out.println("Opcion no valida. Por favor, seleccione una opcion del menu.");
                    break;

                    

            }
     }
    }
}
