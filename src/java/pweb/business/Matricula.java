package pweb.business;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Matricula {
    
  
    private String Nombre;
    private String Ciclo;
    private String Creditos;

    public Matricula () {
    
        Nombre = "";
        Ciclo = "";
        Creditos ="";
    }

    public Matricula( String nombre, String ciclo, String creditos) {
     
        this.Nombre = nombre;
        this.Ciclo = ciclo;
        this.Creditos = creditos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCiclo() {
        return Ciclo;
    }

    public void setCiclo(String Ciclo) {
        this.Ciclo  = Ciclo;
    }

    public String getCreditos() {
        return Creditos;
    }

    public void setCreditos(String Creditos) {
        this.Creditos = Creditos;
    }
}

