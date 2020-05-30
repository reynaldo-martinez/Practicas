
package Entidades;

public class Inscripcion {
    private Alumno alumno;
    private Docente docente;
    private Materia materia1;
    private Materia materia2;
    private Materia materia3;
    private Materia materia4;
    private Materia materia5;

    public Inscripcion(Alumno alumno, Docente docente, Materia materia1, Materia materia2, Materia materia3, Materia materia4, Materia materia5) {
        this.alumno = alumno;
        this.docente = docente;
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.materia3 = materia3;
        this.materia4 = materia4;
        this.materia5 = materia5;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Materia getMateria1() {
        return materia1;
    }

    public void setMateria1(Materia materia1) {
        this.materia1 = materia1;
    }

    public Materia getMateria2() {
        return materia2;
    }

    public void setMateria2(Materia materia2) {
        this.materia2 = materia2;
    }

    public Materia getMateria3() {
        return materia3;
    }

    public void setMateria3(Materia materia3) {
        this.materia3 = materia3;
    }

    public Materia getMateria4() {
        return materia4;
    }

    public void setMateria4(Materia materia4) {
        this.materia4 = materia4;
    }

    public Materia getMateria5() {
        return materia5;
    }

    public void setMateria5(Materia materia5) {
        this.materia5 = materia5;
    }
    
    
    
    
    
}
