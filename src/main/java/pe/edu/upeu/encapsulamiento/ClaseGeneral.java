package pe.edu.upeu.encapsulamiento;

import pe.edu.upeu.encapsulamiento.modelo.Persona;

public class ClaseGeneral {

    public static void probarJugador(){
        Jugador jugador = new Jugador();
        jugador.setNombre("Lionel");
        jugador.setApellido("Messi");
        jugador.setEdad(36);
        jugador.setPosicon("Delantero");
        jugador.setNumeroCam(10);

        System.out.println(jugador.toString());;
    }

    public static void probar(){
        Estudiante estudiante=new Estudiante();
        estudiante.setCodigo("202513287");
        estudiante.setCarrera("Sistemas");
        estudiante.trabajo();
    }

    public static void main(String[] args) {
        Persona persona=new Persona(); //objeto
        persona.setNombre("Pedro");
        persona.setEdad(18);
        persona.setGenero('M');
        persona.saludo();

        probar();

        probarJugador();
    }
}
