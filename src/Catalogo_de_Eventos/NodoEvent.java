package Catalogo_de_Eventos;

public class NodoEvent {
    private Evento dato;
    private NodoEvent siguiente;
    
    public NodoEvent(){
        this.siguiente = null;
    }

    public Evento getDato() {
        return dato;
    }

    public void setDato(Evento dato) {
        this.dato = dato;
    }

    public NodoEvent getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEvent siguiente) {
        this.siguiente = siguiente;
    }
}
