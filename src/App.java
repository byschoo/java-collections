import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        List<String> superheroes = new ArrayList<>(); //Ordena de acuerdo a como fue insertado, van por índice y se pueden duplicar

        superheroes.add("Superman".toUpperCase());
        superheroes.add("Wonderwoman".toUpperCase());
        superheroes.add("Batman".toUpperCase());
        superheroes.add("Robbin".toUpperCase());
        superheroes.add("Aquaman".toUpperCase());
        superheroes.add("Flash".toUpperCase());
        superheroes.add("Robbin".toUpperCase());
        superheroes.add("Robbin".toUpperCase());
        superheroes.add("Robbin".toUpperCase());

        System.out.println("Hay "+ superheroes.size() +" superhéroes que han llegado a la fiesta: ");

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
        
        System.out.println(superheroes.get(0) + " está ebrio, se quitó el traje y revela su verdadera identidad.");
        superheroes.set(0, "Clark ken");

        System.out.println("\nQuedan "+ superheroes.size() +" superhéroes aún en la fiesta: ");
        
        for (String superheroe : superheroes) {
            System.out.println(superheroe.toUpperCase());
        }
        
        System.out.println("\n"+ superheroes.get(3) + " está ebrio.\n");


        scanner.close();
    }
}
