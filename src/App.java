import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> inventarioHash = new HashMap<>(); //No hay garantía de orden.

        System.out.println("Bienvenido a la Frutería del Abuelo");

        inventarioHash.put("Banana", 1.45);
        inventarioHash.put("Platano", 1.85);
        inventarioHash.put("Naranja", 1.75);
        inventarioHash.put("Mandarina", 1.25);
        inventarioHash.put("Fresa", 2.45);
        inventarioHash.put("Mango", 3.15);

        System.out.println("El inventario es el siguiente: ");
        
        for (String fruta : inventarioHash.keySet()) {
            System.out.println(fruta + ": €" + inventarioHash.get(fruta));
        }

        System.out.print("\nQuieres buscar una fruta: ");
        String chekFruta = scanner.nextLine();

        if (inventarioHash.containsKey(chekFruta)) {
            System.out.println("Pide, que te la tengo. Cuánto quieres?");
        } else {
            System.out.println("No la tenemos, nos llega mañana.");
        }

        scanner.close();
    }
}
