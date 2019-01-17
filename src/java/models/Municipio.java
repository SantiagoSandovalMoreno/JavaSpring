
package models;


public class Municipio {
    
    private int id;
    private String nombre;
    private String estado;
    private Departamento departamento;

    public Municipio() {
    }

    public Municipio(String nombre, String estado, Departamento departamento) {
        this.nombre = nombre;
        this.estado = estado;
        this.departamento = departamento;
    }

    public Municipio(int id, String nombre, String estado, Departamento departamento) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
        this.departamento = departamento;
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

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
   
    
    
}
