package animales;

public class Animal{
   protected void hacerSonido(){
       System.out.println("El animal hace un sonido");
   }
}

class Perro extends Animal{
    protected void hacerSonido(){
        System.out.println("El perro hace guau");
    }
}

class Gato extends Animal{
    @Override
    protected void hacerSonido() {
        System.out.println("El gato hace miau");
    }
}
class PruebaAnimal{
    // Método polimórfico
    static void imprimirSonido(Animal animal){
        animal.hacerSonido();

    }


    public static void main(String[] args) {
        // Objeto de la clase padre (Animal)
        var animal = new Animal();
        var animal1 = new Perro();
        var animal2 = new Gato();
        imprimirSonido(animal2);



    }
}