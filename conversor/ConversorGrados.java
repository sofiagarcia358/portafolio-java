package conversor;

import mis_metodos.ListaOPciones;

import java.util.Scanner;

public class ConversorGrados {

    public static void grados() {
        System.out.println("Operaciones Disponibles: ");
        String[] operacion = {"F°/C°", "C°/F°"};

        ListaOPciones.cargarOpciones(operacion);


        Scanner seleccion = new Scanner(System.in);
        System.out.print("[?]: ");
        int opcion = seleccion.nextInt();


        //PROCESO
        Scanner datos = new Scanner(System.in);
        System.out.print("numero 1: ");
        double num1 = datos.nextDouble();


        System.out.println();

        switch (opcion) {
            case 1:

                System.out.println("Respuesta en Celcius: " + Celcius(num1));
                break;

            case 2:


                System.out.println("Respuesta en Farenheit: " + farenheit(num1));
                break;
        }
    }
    public static int Celcius(double num1){

        double Celcius = (num1-32)*5/9;

        return (int) Celcius;

    }
    public static int farenheit(double num1){
        double farenheit = (num1*9/5)+32;

        return (int) farenheit;
    }

    }