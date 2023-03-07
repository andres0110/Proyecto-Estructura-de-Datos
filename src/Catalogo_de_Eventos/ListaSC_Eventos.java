package Catalogo_de_Eventos;

import javax.swing.JOptionPane;

public class ListaSC_Eventos {
    private NodoEvent inicio;
    private NodoEvent fin;
   
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
    public boolean verificarDisponibilidadEvento(String DireccionEvento,String LugarEvento ,String FechaEvento, NodoEvent nodoActual) {
        if (nodoActual == null) {
            return true;
        } else if (nodoActual.getDato().getDireccionEvento().equals(DireccionEvento) && nodoActual.getDato().getFechaEvento().equals(FechaEvento)
                &&  nodoActual.getDato().getLugarEvento().equals(LugarEvento)) {
            return false;
        } else {
            return verificarDisponibilidadEvento(DireccionEvento, LugarEvento ,FechaEvento, nodoActual.getSiguiente());
        }
}
    public void agregar(Evento e){
        NodoEvent nuevo = new NodoEvent();
        nuevo.setDato(e);
        if (esVacia()) {
            inicio = nuevo;
            fin = nuevo;
            fin.setSiguiente(inicio);
        } else if (verificarDisponibilidadEvento(nuevo.getDato().getDireccionEvento(),nuevo.getDato().getLugarEvento(),nuevo.getDato().getFechaEvento()
                , inicio)) {
            JOptionPane.showMessageDialog(null, "Ya exite un evento en esta fecha.");
        }else if(verificarDisponibilidadEvento(nuevo.getDato().getDireccionEvento(),nuevo.getDato().getLugarEvento(),nuevo.getDato().getFechaEvento()
                , fin)){
            JOptionPane.showMessageDialog(null, "Ya exite un evento en esta fecha.");
        }else if(verificarDisponibilidadEvento(nuevo.getDato().getDireccionEvento(),nuevo.getDato().getLugarEvento(),nuevo.getDato().getFechaEvento()
                , fin.getSiguiente())){
            JOptionPane.showMessageDialog(null, "Ya exite un evento en esta fecha.");
        }
        else{
            fin.setSiguiente(nuevo);
            nuevo.setSiguiente(inicio);
            fin = nuevo;
        }
    }
    
    public void mostrarElementos() {
        if (!esVacia()) {
            String s = "";
            NodoEvent aux = inicio;
            s = s + aux.getDato().getNomEvento()+ "--" + aux.getDato().getFechaEvento()+"--"+aux.getDato().getLugarEvento()
                    + aux.getDato().getCiudadEvento()+"--"+aux.getDato().getDireccionEvento()+"--"+aux.getDato().getEstadoEvento()+"-->";
            aux = aux.getSiguiente();
            while (aux != inicio) {
                s = s + aux.getDato().getNomEvento()+ "--" + aux.getDato().getFechaEvento()+"--"+aux.getDato().getLugarEvento()
                    + aux.getDato().getCiudadEvento()+"--"+aux.getDato().getDireccionEvento()+"--"+aux.getDato().getEstadoEvento()+"-->";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null,
                    "La lista simple circular contiene:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null,
                    "¡No se pueden mostrar elementos, lista vacía");
        }
    }
    public void editarEvento(Evento e, NodoEvent nodoActual) {
        // Verificar si el nodo actual es null, lo que significa que no encontramos el evento
        if (nodoActual == null) {
            JOptionPane.showMessageDialog(null, "No se encontró el evento.");
            
        } else if (nodoActual.getDato().getFechaEvento().equals(e.getFechaEvento())) {
            // Si encontramos el evento, lo actualizamos
            nodoActual.setDato(e);
            JOptionPane.showMessageDialog(null, "El evento ha sido actualizado.");
            
        } else {
            // Si la fecha del nodo actual es anterior al evento que estamos editando,
            // seguimos avanzando en la lista recursivamente
            editarEvento(e, nodoActual.getSiguiente());
        }
    }

}
