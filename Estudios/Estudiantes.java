package Estudios;

public class Estudiantes {
    private String Nombre;
    private String Correo;
    private String carrera;
    private String edad;
    private boolean solvencia;


    public Estudiantes(String Nombre,String Correo , String carrera, String edad, boolean solvencia){
        this.Nombre =Nombre;
        this.Correo = Correo;
        this.carrera= carrera;
        this.edad = edad;
        this.solvencia = solvencia;
    }

    public String getNombre(){return Nombre;}
    public String getCorreo(){return Correo;}
    public String getCarrera(){return carrera;}
    public String getEdad(){return edad;}
    public boolean getSolvencia(){return solvencia;}


    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    public void setCorreo(String correo){
        this.Correo = correo;
    }
    public void setCarrera(String carrera){
        this.carrera =carrera;
    }
    public void setEdad(String edad){
        this.edad = edad;
    }
    public void setSolvencia(Boolean solvencia){
        this.solvencia = solvencia;
    }

    @Override
    public String toString(){
        return "Nombre: "+ Nombre + "Autor: "+ Correo + "Fecha: "+ carrera + "edad" + edad + "Solvencia" + solvencia;
    }

}
