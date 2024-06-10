package conversor_moneda;

import opciones.ListaOPciones;

import java.util.Scanner;

public class Conversor_monedas {
    public static void monedas() {

        System.out.println("Operaciones Disponibles: ");
        String[] conversion = {"Quetzal-Dolar",
                "Dolar/Quetzal",
                "Pesos Mx/Quetzal",
                "Quetzal/Pesos Mx"};

        ListaOPciones.cargarOpciones(conversion);

        Scanner seleccion = new Scanner(System.in);
        System.out.print("[?]: ");
        int opcion = seleccion.nextInt();

        Scanner recopilacion_d = new Scanner(System.in);
        System.out.print("numero 1: ");
        double num1 = recopilacion_d.nextDouble();


        switch (opcion) {
            case 1:
                System.out.println("Respuesta Dolares: " + dolar(num1 ));
                break;
            case 2:
                System.out.println("Respuesta Quetzales: " + quetalD(num1));
                break;
            case 3:
                System.out.println("Respuesta Quetzales: " + quetzalM(num1 ));
                break;
            case 4:
                System.out.println("Respuesta Pesos Mexicanos: " + pesos(num1));
                break;
        }

    }

    public static double dolar(double num1) {
        double dolares = num1 * 0.13;
        return dolares;
    }

    public static double quetalD(double num1) {
        double QuetzalDolar = num1 * 7.76;
        return QuetzalDolar;
    }
    public static double quetzalM(double num1) {
        double QuetzalPeso = num1 * 0.42;
        return QuetzalPeso;
    }
    public static double pesos(double num1) {
        double pesoMexico = num1 * 2.39;
        return pesoMexico;
    }
}
