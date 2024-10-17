/* Ejemplo Interfaz List aprenderaprogramar.com */

public class Persona{

    private int idPersona;
    private String nombre;
    private int altura; 

    public Persona(int idPersona, String nombre, int altura) {

        this.idPersona = idPersona;
        this.nombre = nombre;
        this.altura = altura;
    }

    public int getAltura() { return altura; } //Omitimos otros métodos get y set para simplificar 

    @Override
    public String toString() {
        return "Persona-> ID: "+idPersona+" Nombre: "+nombre+" Altura: "+altura+"\n";
    }
}