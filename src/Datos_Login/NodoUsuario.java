/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos_Login;

public class NodoUsuario {
    
    //Atributo
    private Usuario elemento;
    private NodoUsuario siguiente;
    
    
    //Contructor
    public NodoUsuario(){
    
        this.siguiente=null;
    }

    
    //Get and set
    public Usuario getElemento() {
        return elemento;
    }

    public void setElemento(Usuario elemento) {
        this.elemento = elemento;
    }

    public NodoUsuario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoUsuario siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
