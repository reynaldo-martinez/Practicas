/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesInterfaces;

/**
 *
 * @author rey
 */
public abstract class Construccion {
    private String tipoEdificio;
    private int niveles;
    private String cliente;
    private String arquitecto;

    public Construccion(String tipoEdificio, int niveles, String cliente, String arquitecto) {
        this.tipoEdificio = tipoEdificio;
        this.niveles = niveles;
        this.cliente = cliente;
        this.arquitecto = arquitecto;
    }

    
    
    
    
    public abstract String fehcaFinalizado();

    /**
     * @return the tipoEdificio
     */
    public String getTipoEdificio() {
        return tipoEdificio;
    }

    /**
     * @param tipoEdificio the tipoEdificio to set
     */
    public void setTipoEdificio(String tipoEdificio) {
        this.tipoEdificio = tipoEdificio;
    }

    /**
     * @return the niveles
     */
    public int getNiveles() {
        return niveles;
    }

    /**
     * @param niveles the niveles to set
     */
    public void setNiveles(int niveles) {
        this.niveles = niveles;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the arquitecto
     */
    public String getArquitecto() {
        return arquitecto;
    }

    /**
     * @param arquitecto the arquitecto to set
     */
    public void setArquitecto(String arquitecto) {
        this.arquitecto = arquitecto;
    }

   
    
    
}
