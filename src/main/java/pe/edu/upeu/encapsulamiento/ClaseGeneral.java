package pe.edu.upeu.encapsulamiento;

import pe.edu.upeu.encapsulamiento.modelo.Persona;

public class ClaseGeneral {

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
    }
}
