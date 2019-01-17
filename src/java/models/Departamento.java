
package models;

public class Departamento {
    private int id;
    private String nombre;
    private String estado;

    public Departamento() {
    }

    public Departamento(String nombre, String estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public Departamento(int id, String nombre, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
