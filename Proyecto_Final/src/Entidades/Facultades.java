
package Entidades;

import java.util.ArrayList;

public class Facultades {
    private String NombreFacu;
    public ArrayList<Carrera>lCarreras;

    public Facultades(String NombreFacu) {
        this.NombreFacu=NombreFacu;
    }

    public String getNombreFacu() {
        return NombreFacu;
    }

    public void setNombreFacu(String NombreFacu) {
        this.NombreFacu = NombreFacu;
    }
    
}
