package Clases;

import java.util.List;

/**
 *
 * @author Kendall
 */
public class Ciudad {

    private int id_ciu;
    private int id_reg;
    private String nombre;
    private List<Integer> Regiones;

    public List<Integer> getRegiones() {
        return Regiones;
    }

    public void setRegiones(List<Integer> Regiones) {
        this.Regiones = Regiones;
    }

    public Ciudad(int id_ciu, int id_reg, String nombre, List<Integer> Regiones) {
        this.id_ciu = id_ciu;
        this.id_reg = id_reg;
        this.nombre = nombre;
        this.Regiones = Regiones;
    }

    public Ciudad() {
    }

    public Ciudad(int id_ciu, int id_reg, String nombre) {
        this.id_ciu = id_ciu;
        this.id_reg = id_reg;
        this.nombre = nombre;
    }

    public int getId_ciu() {
        return id_ciu;
    }

    public void setId_ciu(int id_ciu) {
        this.id_ciu = id_ciu;
    }

    public int getId_reg() {
        return id_reg;
    }

    public void setId_reg(int id_reg) {
        this.id_reg = id_reg;
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
