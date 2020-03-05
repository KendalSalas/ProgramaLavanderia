/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Kendall
 */
public class Boleta {
    private int idBoleta;
    private int idMetodoPago;
    private int neto;
    private double iva;
    private int idOrden;

    public Boleta() {
    }

    public Boleta(int idBoleta, int idMetodoPago, int neto, double iva, int idOrden) {
        this.idBoleta = idBoleta;
        this.idMetodoPago = idMetodoPago;
        this.neto = neto;
        this.iva = iva;
        this.idOrden = idOrden;
    }

    public int getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(int idBoleta) {
        this.idBoleta = idBoleta;
    }

    public int getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setIdMetodoPago(int idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    public int getNeto() {
        return neto;
    }

    public void setNeto(int neto) {
        this.neto = neto;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }
    
    
}
