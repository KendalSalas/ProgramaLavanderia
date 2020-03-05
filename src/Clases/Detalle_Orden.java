package Clases;

public class Detalle_Orden {

    private int idDetalle;
    private int idOrden;
    private int tipoPrenda;
    private int estadoDetalle;
    private String observacion;

    public Detalle_Orden() {
    }

    public Detalle_Orden(int idDetalle, int idOrden, int tipoPrenda, int estadoDetalle, String observacion) {
        this.idDetalle = idDetalle;
        this.idOrden = idOrden;
        this.tipoPrenda = tipoPrenda;
        this.estadoDetalle = estadoDetalle;
        this.observacion = observacion;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public int getTipoPrenda() {
        return tipoPrenda;
    }

    public void setTipoPrenda(int tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
    }

    public int getEstadoDetalle() {
        return estadoDetalle;
    }

    public void setEstadoDetalle(int estadoDetalle) {
        this.estadoDetalle = estadoDetalle;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

}
