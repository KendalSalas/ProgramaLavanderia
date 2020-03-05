package Clases;

/**
 *
 * @author Kendall
 */
public class Estado_Orden {

    private int idEstado;
    private String nombre;

    public Estado_Orden() {
    }

    public Estado_Orden(int idEstado, String nombre) {
        this.idEstado = idEstado;
        this.nombre = nombre;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
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
