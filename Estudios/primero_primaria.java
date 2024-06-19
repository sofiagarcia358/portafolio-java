package Estudios;

import java.util.Scanner;

public class primero_primaria {

    public static void niños() {
        System.out.println("\nESTUDIANTES DE PRIMERO:\n");

        Estudiantes es1 = new Estudiantes("Luis Reyes", "luisito@scl.edu.gt", "1ro primaria", "8", true);
        Estudiantes e2 = new Estudiantes("Nataly Vasquez", "natVas@gmail.com", "1ro primaria", "7", true);
        Estudiantes e3 = new Estudiantes("Aaron Aguilar", "wata@gmail.com", "1ro primaria", "8", true);
        Estudiantes e4 = new Estudiantes("Isai Girón", "isai@scl.edu.gt", "1ro primaria", "8", false);
        Estudiantes e5 = new Estudiantes("Dana Hernandez", "dana@scl.edu.gt", "1ro primaria", "7", true);


        Scanner src = new Scanner(System.in);

        System.out.println(es1.getNombre() + ", " + es1.getCorreo());
        System.out.println(e2.getNombre() + ", " + e2.getCorreo());
        System.out.println(e3.getNombre() + ", " + e3.getCorreo());
        System.out.println(e4.getNombre() + ", " + e4.getCorreo());
        System.out.println(e5.getNombre() + ", " + e5.getCorreo());


        System.out.println("\nCURSOS: \n");

        Cursos cu1 = new Cursos("Matematica", "cuentas", "2periodo");
        Cursos cu2 = new Cursos("Contabilidad", "Cuentas", "2periodo");
        Cursos cu3 = new Cursos("Ingles", "idiomas", "2periodo");
        Cursos cu4 = new Cursos("Computación", "tecnología", "2periodo");
        Cursos cu5 = new Cursos("Literatura", "lenguaje", "2periodo");


        System.out.println(cu1.getNombre());
        System.out.println(cu2.getNombre());
        System.out.println(cu3.getNombre());
        System.out.println(cu4.getNombre());
        System.out.println(cu5.getNombre());
    }
        }




