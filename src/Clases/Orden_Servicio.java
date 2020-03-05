package Clases;

/**
 *
 * @author Kendall
 */
public class Orden_Servicio {

    private int idOrden;
    private int idCliente;
    private int idVendedor;
    private int idEstado;
    private String fechaRec;
    private String fechaDev;

    public Orden_Servicio() {
    }

    public Orden_Servicio(int idOrden, int idCliente, int idVendedor, int idEstado, String fechaRec, String fechaDev) {
        this.idOrden = idOrden;
        this.idCliente = idCliente;
        this.idVendedor = idVendedor;
        this.idEstado = idEstado;
        this.fechaRec = fechaRec;
        this.fechaDev = fechaDev;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getFechaRec() {
        return fechaRec;
    }

    public void setFechaRec(String fechaRec) {
        this.fechaRec = fechaRec;
    }

    public String getFechaDev() {
        return fechaDev;
    }

    public void setFechaDev(String fechaDev) {
        this.fechaDev = fechaDev;
    }

    @Override
    public String toString() {
        return fechaRec;
    }
}
