/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author rey
 */
public class Animales {
    private Pez pez;
    private Ave ave;
    private Roedor roedor;
    private Reptil reptil;
    private Insecto insecto;

    public Animales(Pez pez, Ave ave, Roedor roedor, Reptil reptil, Insecto insecto) {
        this.pez = pez;
        this.ave = ave;
        this.roedor = roedor;
        this.reptil = reptil;
        this.insecto = insecto;
    }

    /**
     * @return the pez
     */
    public Pez getPez() {
        return pez;
    }

    /**
     * @param pez the pez to set
     */
    public void setPez(Pez pez) {
        this.pez = pez;
    }

    /**
     * @return the ave
     */
    public Ave getAve() {
        return ave;
    }

    /**
     * @param ave the ave to set
     */
    public void setAve(Ave ave) {
        this.ave = ave;
    }

    /**
     * @return the roedor
     */
    public Roedor getRoedor() {
        return roedor;
    }

    /**
     * @param roedor the roedor to set
     */
    public void setRoedor(Roedor roedor) {
        this.roedor = roedor;
    }

    /**
     * @return the reptil
     */
    public Reptil getReptil() {
        return reptil;
    }

    /**
     * @param reptil the reptil to set
     */
    public void setReptil(Reptil reptil) {
        this.reptil = reptil;
    }
    
    /**
     * @return the insecto
     */
    public Insecto getInsecto() {
        return insecto;
    }

    /**
     * @param insecto the insecto to set
     */
    public void setInsecto(Insecto insecto) {
        this.insecto = insecto;
    }
    
    
}
