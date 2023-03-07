package Catalogo_De_Asientos;

public class Asiento {

    private String codigoArea;
    private String numeroAsiento;
    private String costoVenta;
    private String estado;

    public Asiento() {
        this.codigoArea = " ";
        this.numeroAsiento = " ";
        this.costoVenta = " ";
        this.estado = " ";
    }

    public String getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getCostoVenta() {
        return costoVenta;
    }

    public void setCostoVenta(String costoVenta) {
        this.costoVenta = costoVenta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
