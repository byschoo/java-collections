
/* Ejemplo Interface Set y SortedSet, clase HashSet y TreeSet aprenderaprogramar.com */
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Persona> cjsp = new HashSet<Persona>(); // Objeto Conjunto Set - HashSet, No garantiza orden
        SortedSet<Persona> cjssp = new TreeSet<Persona>(); // Objeto Conjunto SortedSet - TreeSet, no duplica extricto, ordenado

        Persona p = new Persona(1, "Marta", 165);
        cjsp.add(p);
        cjssp.add(p);
        
        // p = new Persona(1, "Marta", 165);
        p = new Persona(2, "Elena", 155);
        cjsp.add(p);
        cjssp.add(p);

        p = new Persona(3, "María", 170);
        cjsp.add(p);
        cjssp.add(p);

        System.out.println("Personas en el conjunto SET - HashSet: " + cjsp);
        System.out.println("Personas en el conjunto ordenado SortedSet - TreeSet: " + cjssp);
    }

}
