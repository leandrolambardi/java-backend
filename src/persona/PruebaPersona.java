package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("****  Creación de clase y objetos del tipo Persona  ****");
        System.out.println("Personas creadas: "
                + Persona.getContadorPersonas());

        var objeto1 = new Persona("Layla", "Acosta" );
        System.out.println(objeto1);
        System.out.println("Personas creadas: " + Persona.getContadorPersonas());
        var objeto2 = new Persona("Ian", "Gomez" );
        System.out.println(objeto2);
        System.out.println("Personas creadas: " + Persona.getContadorPersonas());
    }
}
