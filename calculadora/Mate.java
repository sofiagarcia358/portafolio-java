package calculadora;

import mis_metodos.ListaOPciones;

import java.util.Scanner;

public class Mate {
public static void suma() {

    System.out.println("Operaciones Disponibles: ");
    String[] operacion = {"suma", "resta", "Division", "multiplicacion"};


    ListaOPciones.cargarOpciones(operacion);


    Scanner seleccion = new Scanner(System.in);
    System.out.print("[?]: ");
    int opcion = seleccion.nextInt();

    //PROCESO
    Scanner datos = new Scanner(System.in);
    System.out.print("numero 1: ");
    double num1 = datos.nextDouble();
    System.out.print("número 2: ");
    double num2 =datos.nextDouble();


    System.out.println();

    switch (opcion) {
        case 1:

            System.out.println("Respuesta: " + sumar(num1,num2));
            break;

        case 2:


            System.out.println("Respuesta: " + resta(num1,num2));
            break;

        case 3:

            System.out.println("Respuesta: " + division(num1, num2));
            break;

        case 4:


            System.out.println("Respuesta: " + multiplicacion(num1, num2));
            break;

    }
}
    public static int sumar(double num1,double num2){

        double sumas = num1+num2;

        return (int) sumas;

    }
    public static int resta(double num1,double num2){
        double restas = num1-num2;

        return (int) restas;
    }

    public static double division(double num1, double num2){
        double dividir = num1/num2;

        return dividir;
    }

    public static int multiplicacion(double num1, double num2){

        double  multiplicacion = num1*num2;

        return (int) multiplicacion;
    }
}
