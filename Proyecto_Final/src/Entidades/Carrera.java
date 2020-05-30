
package Entidades;

import java.util.ArrayList;

public class Carrera {
    private String Nombre;
    public ArrayList<Materia>lMaterias;

    public Carrera(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    
}
