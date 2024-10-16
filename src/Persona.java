/* Ejemplo Interface Comparator vs Comparable aprenderaprogramar.com */

public class Persona implements Comparable<Persona> {
    private int idPersona;
    private String nombre;
    private int altura;

    public Persona (int idPersona, String nombre, int altura) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.altura = altura;}

    @Override
    public String toString() {
        return "\nPersona-> ID: "+idPersona+" Nombre: "+nombre+" Altura: "+altura;}

    @Override
    public int compareTo(Persona o) {
        return this.nombre.compareTo(o.nombre);}

    public int getIdPersona() {return idPersona;}
    public String getNombre() {return nombre;}
    public int getAltura() {return altura;}
}