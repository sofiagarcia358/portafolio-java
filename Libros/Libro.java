package Libros;

import java.util.Scanner;

public class Libro {
    private String titulo;
    private String autor;
    private String fecha;

    public Libro(String titulo, String autor, String fecha) {
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
    }

    public String getTitulo() {return titulo;}
    public String getAutor() {return autor;}
    public String getFecha() {return fecha;}

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    @Override
    public String toString(){
        return "Titulo: "+ titulo + "Autor: "+autor + "Fecha: "+fecha;
    }
    public String torString(){
        return "Titulo: "+ titulo + "Autor: "+autor + "Fecha: "+fecha;
    }
    public String toaString(){
        return "Titulo: "+ titulo + "Autor: "+autor + "Fecha: "+fecha;
    }
    public String tobString(){
        return "Titulo: "+ titulo + "Autor: "+autor + "Fecha: "+fecha;
    }
    public String toxString(){
        return "Titulo: "+ titulo + "Autor: "+autor + "Fecha: "+fecha;
    }
    public String todString(){
        return "Titulo: "+ titulo + "Autor: "+autor + "Fecha: "+fecha;
    }
    public String tolString(){
        return "Titulo: "+ titulo + "Autor: "+autor + "Fecha: "+fecha;
    }
    public String tomString(){
        return "Titulo: "+ titulo + "Autor: "+autor + "Fecha: "+fecha;
    }
    public String tonString(){
        return "Titulo: "+ titulo + "Autor: "+autor + "Fecha: "+fecha;
    }
    public String towString(){
        return "Titulo: "+ titulo + "Autor: "+autor + "Fecha: "+fecha;
    }
}