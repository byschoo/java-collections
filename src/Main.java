import java.util.ArrayList;
import java.util.Collections; 

public class Main {

  public static void main(String arg[]) {

    ArrayList<Persona> listaPersonas = new ArrayList<>();

    listaPersonas.add(new Persona(1,"Maria",185));
    listaPersonas.add(new Persona(2,"Carla",190));
    listaPersonas.add(new Persona(3,"Yovana",170));

    // Collections.sort(listaPersonas);  // Ejemplo uso ordenación natural
    Collections.sort(listaPersonas, new OrdenarPersonaPorAltura()); // Ejemplo uso ordenación total, altura

    System.out.println("Personas Ordenadas por orden: "+listaPersonas);
  }
}
