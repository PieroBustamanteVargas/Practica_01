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
public class Alumno {
    
    private String Codigo;
    private String Nombre;
    private String Apellidos;
    private String Correo;

    public Alumno() {
        Codigo = "";
        Nombre = "";
        Apellidos = "";
        Correo ="";
    }

    public Alumno(String codigo, String nombre, String apellidos, String correo) {
        this.Codigo = codigo;
        this.Nombre = nombre;
        this.Apellidos = apellidos;
        this.Correo = correo;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
}
}

