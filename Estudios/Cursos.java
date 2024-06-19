package Estudios;

import javax.print.DocFlavor;

public class Cursos {
    private String nombre;
    private String categoria;
    private String periodo;

    public Cursos(String nombre, String categoria, String periodo){
        this.nombre = nombre;
        this.categoria = categoria;
        this.periodo = periodo;
    }

    public String getNombre() {return nombre;}
    public String getCategoria() {return categoria;}
    public String getPeriodo() {return periodo;}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

}
