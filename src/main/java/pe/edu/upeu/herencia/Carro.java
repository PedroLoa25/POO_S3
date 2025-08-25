package pe.edu.upeu.herencia;

public class Carro extends Vehiculo{
    String modelo = "Mustang";
    String placa = "ABC-123";
    String color = "Rojo";

    void caracteristicas(){
        System.out.println("Las caracteristicas de este carro son: ");
        System.out.println("La marca es: " +marca); //atributo heredado
        System.out.println("El modelo es: "+modelo);
        System.out.println("La placa es: "+placa);
        System.out.println("El color es: "+color);
    }

    public static void main(String[] args) {
        Carro carro=new Carro();
        carro.caracteristicas();
        carro.sonido(); //metodo heredado
    }
}
