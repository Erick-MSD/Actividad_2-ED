import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Selecciona el tipo de lista ---");
        System.out.println("1. Simplemente enlazada");
        System.out.println("2. Doblemente enlazada");
        System.out.println("3. Circular");
        int tipo;
        try {
            if (sc.hasNextInt()) {
                tipo = sc.nextInt();
                sc.nextLine(); // limpiar buffer
            } else {
                System.out.println("No se detectó entrada. Usando tipo 1 por defecto.");
                tipo = 1;
            }
        } catch (Exception e) {
            System.out.println("Entrada no disponible, usando tipo 1 por defecto.");
            tipo = 1;
        }

        LinkedList<Object> lista;

        if (tipo == 1) lista = new LinkedList<>(false, false);
        else if (tipo == 2) lista = new LinkedList<>(true, false);
        else lista = new LinkedList<>(false, true);

        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Insertar dato");
            System.out.println("2. Eliminar dato");
            System.out.println("3. Buscar dato");
            System.out.println("4. Mostrar lista");
            System.out.println("5. Insertar ejemplos de DataTypeExamples");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            try {
                if (sc.hasNextInt()) {
                    opcion = sc.nextInt();
                    sc.nextLine();
                } else {
                    // no hay más entrada: salir
                    System.out.println("No hay entrada para menú. Saliendo.");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error leyendo opción. Saliendo.");
                break;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Introduce un valor (texto): ");
                    String valor = sc.nextLine();
                    lista.insert(valor);
                    break;
                case 2:
                    System.out.print("Introduce el valor a eliminar: ");
                    String elim = sc.nextLine();
                    System.out.println(lista.delete(elim) ? "Eliminado" : "No encontrado");
                    break;
                case 3:
                    System.out.print("Introduce el valor a buscar: ");
                    String busq = sc.nextLine();
                    System.out.println(lista.search(busq) ? "Encontrado" : "No encontrado");
                    break;
                case 4:
                    lista.display();
                    break;
                case 5:
                    lista.insert(DataTypeExamples.ejemploPrimitivo());
                    lista.insert(DataTypeExamples.ejemploCadena());
                    lista.insert(DataTypeExamples.ejemploFecha());
                    lista.insert(DataTypeExamples.ejemploContacto());
                    System.out.println("Ejemplos insertados.");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);

        sc.close();
    }
}
