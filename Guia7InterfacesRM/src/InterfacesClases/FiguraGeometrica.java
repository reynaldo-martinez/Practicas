/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesClases;

/**
 *
 * @author rey
 */
public class FiguraGeometrica implements Area, Perimetro {

    public double area;
    public double perimetro;
    
    @Override
    public double calcArea(double base, double altura) {
        return base * altura;
    }

    @Override
    public double calcPerimetro(double largo, double ancho) {
       return 2* (largo + ancho);
    } 
    
}
