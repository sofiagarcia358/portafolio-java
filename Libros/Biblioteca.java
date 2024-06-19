package Libros;

import java.util.Scanner;

public class Biblioteca {
    public static void programa(){
        System.out.println("Biblioteca");

        Libro libro1 =new Libro("Habitos Atomicos", "James Clear", "16/octubre/2018");
        Libro libro2 =new Libro("Orgullo y prejuicio", "Jane Austen", "28/01/1813");
        Libro libro3 =new Libro("El llamado a lo salvaje", "London Jack", "1903");
        Libro libro4 =new Libro("El libro de la selva", "Rudyard Kipling", "1894");
        Libro libro5 =new Libro("El principito", "Antoine de Saint", "1943");
        Libro libro6 =new Libro("Mujercitas", "Louisa May Alcott", "1868");
        Libro libro7 =new Libro("Las mil y una noches", "Mario Vargas Llosa", "2008");
        Libro libro8 =new Libro("Bailén", "Benito Pérez Galdós", "1873");
        Libro libro9 =new Libro("Don juan tenorio", "José Zorrilla", "1844");
        Libro libro10 =new Libro("Hamlet", "William Shakespeare", "1623");
        Scanner src= new Scanner(System.in);

        System.out.println(libro1.getTitulo());
        System.out.println(libro2.getTitulo());


        System.out.println(libro1.getAutor());
        System.out.println(libro2.getAutor());

        System.out.println(libro1.getFecha());
        System.out.println(libro2.getFecha());

        System.out.println(libro1.toString());
        System.out.println(libro2.torString());
        System.out.println(libro3.toaString());
        System.out.println(libro4.tobString());
        System.out.println(libro5.toxString());
        System.out.println(libro6.todString());
        System.out.println(libro7.tolString());
        System.out.println(libro8.tomString());
        System.out.println(libro9.tonString());
        System.out.println(libro10.towString());

    }
}
