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
public class Fundacion extends Empresa{
    public String fundador;

    public Fundacion(String fundador, String nombre, String tipo, String años) {
        super(nombre, tipo, años);
        this.fundador = fundador;
    }
    public String showEslogan(){
        return "Hoy por mi, mañana por ti xd";
    }
}
