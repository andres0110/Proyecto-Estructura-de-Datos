package Gestion;

import Datos_Login.*; //ASI SE IMPORTA UN PAQUETE
import javax.swing.JOptionPane;

public class MetodoUsuarios {

    private NodoUsuario inicio;  //Vamos a usar una COLA 
    private NodoUsuario fin;

    public MetodoUsuarios() {

        this.inicio = null;
        this.fin=null;

    }

    public boolean esVacia() {

        if (inicio == null) {        //Metodo para saber si la estructura esta vacia o no
            return true;
        } else {
            return false;
        }

    }

    public void agregarUsuarios(String nombre,String apellidos,String usuario,String contra) {
        Usuario d = new Usuario();

        d.setNombre(nombre);
        d.setApellidos(apellidos);
        d.setUsuario(usuario);
        d.setContraseña(contra);

        NodoUsuario nuevo = new NodoUsuario();
        nuevo.setElemento(d);

        if (esVacia()) {

            inicio = nuevo;
            fin = nuevo;
           JOptionPane.showMessageDialog(null, "1 AGREGADO");

        } else {

            fin.setSiguiente(nuevo);
            fin = nuevo;
                      JOptionPane.showMessageDialog(null, " AGREGADO");


        }

    }

    /*

    public void inactivar(String nombre, String estado) {

        if (!esVacia()) {

            NodoUsuario aux = inicio;

            while (aux != null) {

                if (aux.getElemento().getNombre().equals(nombre)) {

                    Usuario d = new Usuario();

                    d.setNombre(d.getNombre());
                    d.setApellidos(d.getApellidos());
                    d.setUsuario(d.getUsuario());
                    d.setContraseña(d.getContraseña());
                    d.setEstado(estado);

                    aux.setElemento(d);

                }

                aux = aux.getSiguiente();
            }

        }

    }*/
    
   /* public void mostrarElementos() {
        if (!esVacia()) {
            String s = "";
            NodoUsuario aux = inicio;
            while (aux != null) {
                s = s + aux.getElemento().getNombre() + aux.getElemento().getApellidos() + aux.getElemento().getUsuario()
                        + aux.getElemento().getContraseña() + aux.getElemento().getEstado();
                aux=aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null,
                    "La cola contiene:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No se puede mostrar, cola vacía!");
        }
    }*/

    public boolean validarUsuario(String usuario, String contraseña) {

       boolean valido=false;
        
        if (!esVacia()) {

            NodoUsuario aux = inicio;

            while (aux != null) {

                if ((aux.getElemento().getUsuario().equals(usuario))
                        && (aux.getElemento().getApellidos().equals(contraseña))) {

                    valido=true;

                }
                aux.getSiguiente();
                
            }

        }

        return valido;

    }

}
