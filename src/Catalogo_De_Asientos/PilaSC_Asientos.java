package Catalogo_De_Asientos;

import javax.swing.JOptionPane;

public class PilaSC_Asientos {
    
    private NodoAsiento cima;

    public PilaSC_Asientos() {
        this.cima = null;
    }

    public boolean esVacia() {
        if (cima == null) {
            return true;
        } else {
            return false;
        }
    }

    public void apilar() {
        Asiento a = new Asiento();
        a.setCodigoArea(JOptionPane.showInputDialog(null,
                "Digite el codigo de Area:"));
        a.setNumeroAsiento(JOptionPane.
                showInputDialog(null,
                        "Digite el numero de asiento "));
        NodoAsiento nuevo = new NodoAsiento();
        nuevo.setDato(a);
        if (esVacia()) {
            cima = nuevo;
        } else {
            nuevo.setSiguiente(cima);
            cima = nuevo;
        }
    }

    public void desapilar() {
        if (!esVacia()) {
            cima = cima.getSiguiente();
        } else {
            JOptionPane.showMessageDialog(null,
                    "¡No existen elementos para extraer, pila vacía");
        }
    }

    
    public void mostrarPila() {
        if (!esVacia()) {
            String s = "";
            NodoAsiento aux = cima;
            while (aux != null) {
                s = s + aux.getDato().getCodigoArea() + " "
                        + aux.getDato().getNumeroAsiento() + "\n";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null,
                    "La pila contiene:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No se puede mostrar, pila vacía!");
        }
    }
}

