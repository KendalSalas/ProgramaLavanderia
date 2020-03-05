
package Clases;

import java.util.List;

/**
 *
 * @author Kendall
 */
public class Comuna {
    private int id_com;
    private int id_ciu;
    private String nombre;
    private List<Integer> Ciudad;

    public List<Integer> getCiudad() {
        return Ciudad;
    }

    public void setCiudad(List<Integer> Ciudad) {
        this.Ciudad = Ciudad;
    }

    public Comuna(int id_com, int id_ciu, String nombre, List<Integer> Ciudad) {
        this.id_com = id_com;
        this.id_ciu = id_ciu;
        this.nombre = nombre;
        this.Ciudad = Ciudad;
    }

    public Comuna() {
    }

    public Comuna(int id_com, int id_ciu, String nombre) {
        this.id_com = id_com;
        this.id_ciu = id_ciu;
        this.nombre = nombre;
    }

    public int getId_com() {
        return id_com;
    }

    public void setId_com(int id_com) {
        this.id_com = id_com;
    }

    public int getId_ciu() {
        return id_ciu;
    }

    public void setId_ciu(int id_ciu) {
        this.id_ciu = id_ciu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
    
}
