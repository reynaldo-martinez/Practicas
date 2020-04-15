/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer3;

/**
 *
 * @author rey
 */
public class Camisa extends PrendaVestir implements Tela, EstiloCamisa {

    public Camisa(String talla, String color) {
        super(talla, color);
    }

    

   
    
    @Override
    public String vestir() {
       return "La camisa se esta probando";
    }

    @Override
    public String tipoTela() {
        return "esta camisa es de ceda";
    }

    @Override
    public String estilo() {
        return "El estilo de esta camisa es sport-broches";
    }

  
    
}
