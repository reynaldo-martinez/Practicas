/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesInterfaces;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author rey
 */
public class Edificio extends Construccion implements MedirTerreno, MedirEdificio{
    private double area;
    private double altura;
    private double perimTerreno;
    private double distancTerreno;
    private double base;
    
    
   

    public Edificio(double area, double altura, double perimTerreno, double distancTerreno, String tipoEdificio, int niveles, String cliente, String arquitecto) {
        super(tipoEdificio, niveles, cliente, arquitecto);
        this.area = area;
        this.altura = altura;
        this.perimTerreno = perimTerreno;
        this.distancTerreno = distancTerreno;
    }
    
    

    @Override
    public String fehcaFinalizado() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MMM/YYYY");
        return formatoFecha.format(fecha);
    }

    @Override
    public  double calcPerimetro(double a, double b, double c, double d) {
       return (a*b) + (b*c) + (c*d) + (d*a);
    }

    @Override
    public  double calcDistancia( double escala) {
      return Math.round(((escala * 10) * 100)/100);
    }

    @Override
    public  double calcAltura(double a, double b) {
       return Math.round(((a/b) * 100)/100);
    }

    @Override
    public  double calcArea(double b, double h) {
        return Math.round(((b*h) * 100)/100);
    }

    /**
     * @return the area
     */
    public double getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the perimTerreno
     */
    public double getPerimTerreno() {
        return perimTerreno;
    }

    /**
     * @param perimTerreno the perimTerreno to set
     */
    public void setPerimTerreno(double perimTerreno) {
        this.perimTerreno = perimTerreno;
    }

    /**
     * @return the distancTerreno
     */
    public double getDistancTerreno() {
        return distancTerreno;
    }

    /**
     * @param distancTerreno the distancTerreno to set
     */
    public void setDistancTerreno(double distancTerreno) {
        this.distancTerreno = distancTerreno;
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }
    
    
    
    
}
