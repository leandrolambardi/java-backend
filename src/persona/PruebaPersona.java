package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("****  Creación de clase y objetos del tipo Persona  ****");
        var objeto1 = new Persona("Layla", "Acosta" );
        objeto1.mostrarPersona();
        // Segundo Objeto
        System.out.println();
        var objeto2 = new Persona("Ian", "Gomez");
        objeto2.mostrarPersona();
    }
}
