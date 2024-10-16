import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Set<String> superheroes = new LinkedHashSet<>(); //Ordena de acuerdo a como fue insertado, ni se pueden duplicar elementos

        superheroes.add("Superman".toUpperCase());
        superheroes.add("Wonderwoman".toUpperCase());
        superheroes.add("Batman".toUpperCase());
        superheroes.add("Robbin".toUpperCase());
        superheroes.add("Aquaman".toUpperCase());
        superheroes.add("Flash".toUpperCase());

        System.out.println("Los superhéroes que han llegado a la fiesta son: ");

        for (String superheroe : superheroes) {
            System.out.println(superheroe);
        }
        
        System.out.print("\nHay superhéroes que se van de la fiesta (Y/N): ");
        String centinela = scanner.nextLine().toUpperCase();
        
        while (centinela.equals("Y")) {
            System.out.println("Quién se va: ");
            String seRetiran = scanner.nextLine().toUpperCase();

                if (superheroes.contains(seRetiran)) {
                    superheroes.remove(seRetiran.toUpperCase());
                    System.out.print("Ya se fue " + seRetiran.toUpperCase() + " de la fiesta.\n");
                }else {
                    System.out.print(seRetiran + " no ha estado en la fiesta.\n");
                }

            System.out.print("\nHay otro superhéroe que se va de la fiesta (Y/N): ");
            centinela = scanner.nextLine().toUpperCase();
        }
        
        System.out.println("\nLos superhéroes que han aún están en la fiesta son: ");
        
        for (String superheroe : superheroes) {
            System.out.println(superheroe.toUpperCase());
        }

        scanner.close();
    }
}
