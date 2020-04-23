
package Entidades;

public class Ventas {
    private String Codigo;
    private String NombrePr;
    private int CantidadPr;
    private double PrecioPr;
    private double SubPr;

    public Ventas(String Codigo, String NombrePr, int CantidadPr, double PrecioPr, double SubPr) {
        this.setCodigo(Codigo);
        this.setNombrePr(NombrePr);
        this.setCantidadPr(CantidadPr);
        this.setPrecioPr(PrecioPr);
        this.setSubPr(SubPr);
    }

    
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombrePr() {
        return NombrePr;
    }

    public void setNombrePr(String NombrePr) {
        this.NombrePr = NombrePr;
    }

    public int getCantidadPr() {
        return CantidadPr;
    }

    public void setCantidadPr(int CantidadPr) {
        this.CantidadPr = CantidadPr;
    }

    public double getPrecioPr() {
        return PrecioPr;
    }

    public void setPrecioPr(double PrecioPr) {
        this.PrecioPr = PrecioPr;
    }

    public double getSubPr() {
        return SubPr;
    }

    public void setSubPr(double SubPr) {
        this.SubPr = SubPr;
    }
    
    
}
