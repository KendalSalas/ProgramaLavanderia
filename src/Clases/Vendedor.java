package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Kendall
 */
public class Vendedor {

    private int rut;
    private int rutVend;
    private int idVend;
    private String nombre;
    private String apePat;
    private String apeMat;
    private int idSuc;
    private String correo;
    private int telefono;

    public Vendedor() {
    }

    public Vendedor(int rut, int rutVend, int idVend, String nombre, String apePat, String apeMat, int idSuc, String correo, int telefono) {
        this.rut = rut;
        this.rutVend = rutVend;
        this.idVend = idVend;
        this.nombre = nombre;
        this.apePat = apePat;
        this.apeMat = apeMat;
        this.idSuc = idSuc;
        this.correo = correo;
        this.telefono = telefono;
    }

    public int getRut() {
        return rut;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getRutVend() {
        return rutVend;
    }

    public void setRutVend(int rutVend) {
        this.rutVend = rutVend;
    }

    public int getIdVend() {
        return idVend;
    }

    public void setIdVend(int idVend) {
        this.idVend = idVend;
    }

    public int getIdSuc() {
        return idSuc;
    }

    public void setIdSuc(int idSuc) {
        this.idSuc = idSuc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApePat() {
        return apePat;
    }

    public void setApePat(String apePat) {
        this.apePat = apePat;
    }

    public String getApeMat() {
        return apeMat;
    }

    public void setApeMat(String apeMat) {
        this.apeMat = apeMat;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
