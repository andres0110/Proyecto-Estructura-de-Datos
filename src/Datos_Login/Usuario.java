/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos_Login;

/**
 *
 * @author esteb
 */
public class Usuario {
    
    
    //Atributos
    private String nombre;
    private String apellidos;
    private String usuario;
    private String contraseña;
    private String estado;

    
    //Contructores
    
    
    
    public Usuario(){
    
    
        this.nombre = "";
        this.apellidos = "";
        this.usuario = "";
        this.contraseña = "";
        this.estado = "";
    
    
    }

    
    //Get and set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
}
