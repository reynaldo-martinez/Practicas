/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer3;

/**
 *
 * @author jose reynaldo
 */
public class ArchivoMultimedia {
    
    private String formato;
    private String fechaCreacion;

    public ArchivoMultimedia(String formato, String fechaCreacion) {
        this.formato = formato;
        this.fechaCreacion = fechaCreacion;
    }
    
    public String reproducir(){
        return "El archivo multimedia se está reproduciendo";
    }

    /**
     * @return the formato
     */
    public String getFormato() {
        return formato;
    }

    /**
     * @param formato the formato to set
     */
    public void setFormato(String formato) {
        this.formato = formato;
    }

    /**
     * @return the fechaCreacion
     */
    public String getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * @param fechaCreacion the fechaCreacion to set
     */
    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    
}
