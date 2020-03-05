package Clases;

import java.util.List;

/**
 *
 * @author Kendall
 */
public class Sucursal {

    private int id_suc;
    private int id_com;
    private String direccion_suc;
    private String correo_suc;

    public Sucursal() {
    }

    public Sucursal(int id_suc, int id_com, String direccion_suc, String correo_suc) {
        this.id_suc = id_suc;
        this.id_com = id_com;
        this.direccion_suc = direccion_suc;
        this.correo_suc = correo_suc;
    }

    public int getId_suc() {
        return id_suc;
    }

    public void setId_suc(int id_suc) {
        this.id_suc = id_suc;
    }

    public int getId_com() {
        return id_com;
    }

    public void setId_com(int id_com) {
        this.id_com = id_com;
    }

    public String getDireccion_suc() {
        return direccion_suc;
    }

    public void setDireccion_suc(String direccion_suc) {
        this.direccion_suc = direccion_suc;
    }

    public String getCorreo_suc() {
        return correo_suc;
    }

    public void setCorreo_suc(String correo_suc) {
        this.correo_suc = correo_suc;
    }

    @Override
    public String toString() {
        return direccion_suc;
    }

}
