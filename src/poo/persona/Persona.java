package poo.persona;

public class Persona {

    String nombre;
    String apellido;

    void mostrarPersona(){
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellido = " + apellido);
    }

    public static void main(String[] args) {
        System.out.println("****  Creación de clase y objetos del tipo Persona  ****");
        var objeto1 = new Persona();
        objeto1.nombre = "Layla";
        objeto1.apellido= "Acosta";
        objeto1.mostrarPersona();
        // Segundo Objeto
        System.out.println();
        var objeto2 = new Persona();
        objeto2.nombre ="Ian";
        objeto2.apellido ="Gomez";
        objeto2.mostrarPersona();
    }

}
