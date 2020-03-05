package Clases;

/**
 *
 * @author Kendall
 */
public class Regiones {

    private int id_reg;
    private String nombre;

    public Regiones() {
    }

    public Regiones(int id_reg, String nombre) {
        this.id_reg = id_reg;
        this.nombre = nombre;
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
