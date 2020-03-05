package Clases;

/**
 *
 * @author Kendall
 */
public class Cliente {

    private int rut;
    private int rutVeri;
    private int idCli;
    private String nombre;
    private String apePat;
    private String apeMat;
    private int idSuc;
    private int telefono;
    private String correo;

    public Cliente() {
    }

    public Cliente(int rut, int rutVeri, int idCli, String nombre, String apePat, String apeMat, int idSuc, int telefono, String correo) {
        this.rut = rut;
        this.rutVeri = rutVeri;
        this.idCli = idCli;
        this.nombre = nombre;
        this.apePat = apePat;
        this.apeMat = apeMat;
        this.idSuc = idSuc;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getRutVeri() {
        return rutVeri;
    }

    public void setRutVeri(int rutVeri) {
        this.rutVeri = rutVeri;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
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

    public int getIdSuc() {
        return idSuc;
    }

    public void setIdSuc(int idSuc) {
        this.idSuc = idSuc;
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
