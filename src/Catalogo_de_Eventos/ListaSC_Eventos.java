package Catalogo_de_Eventos;

import javax.swing.JOptionPane;

public class ListaSC_Eventos {
    private NodoEvent inicio;
    private NodoEvent fin;
    private ListaSC_Eventos l;

    public ListaSC_Eventos getL() {
        return l;
    }

    public void setL(ListaSC_Eventos l) {
        this.l = l;
    }
    
    public ListaSC_Eventos(){
        this.inicio=null;
        this.fin = null;
    }
    
    public boolean esVacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }
    public void agregar(Evento e){
        NodoEvent nuevo = new NodoEvent();
        nuevo.setDato(e);
        if (esVacia()) {
            inicio = nuevo;
            fin = nuevo;
            fin.setSiguiente(inicio);
        } else{
            fin.setSiguiente(nuevo);
            nuevo.setSiguiente(inicio);
            fin = nuevo;
        }
    }
    
    public void mostrarElementos() {
        if (!esVacia()) {
            String s = "";
            NodoEvent aux = inicio;
            s = s + aux.getDato().getNomEvento()+ "--" + aux.getDato().getFechaEvento()+ aux.getDato().getLugarEvento()
                    + aux.getDato().getCiudadEvento()+ aux.getDato().getDireccionEvento()+ aux.getDato().getEstadoEvento()+"-->";
            aux = aux.getSiguiente();
            while (aux != inicio) {
                s = s + aux.getDato().getNomEvento()+ "--" + aux.getDato().getFechaEvento()+ aux.getDato().getLugarEvento()
                    + aux.getDato().getCiudadEvento()+ aux.getDato().getDireccionEvento()+ aux.getDato().getEstadoEvento()+"-->";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null,
                    "La lista simple circular contiene:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null,
                    "¡No se pueden mostrar elementos, lista vacía");
        }
    }
}
