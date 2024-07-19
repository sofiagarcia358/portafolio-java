//importar del nombre paquete.nombreClase
import Libros.Biblioteca;
import Estudios.primero_primaria;
import calculadora.calcularEdad;
import conversor.ConversorGrados;
import lista.ListadeCompras;
import conversor.Conversor_monedas;
import interface_grafica.Baner;
import conversor.Longitudes;
import mis_metodos.ListaOPciones;
import iMC.IMC;
import calculadora.Mate;
import mis_metodos.MisMetodos;

import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxRenderer;

//importar de nombreLibreria.Nombrepaquete.NombreClase
import java.awt.*;
import java.util.Scanner;

//método main
public class Main {
    public static void main(String[] args) {

        String[] listaDeOpciones = {
                "calculadora", "iMC",
                "Farenheit / Celsius", "Medidas",
                "Calcular edad", "Listado",
                "Conversos Monedas", "Biblioteca",
                "Opción_9", "Salir" };

        //sección grafica

        //VENTANA
        JFrame frame = new JFrame("Mi Ventana");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Panel para el título
        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("SOFIA");
        titlePanel.add(titleLabel);

        // Panel para el listado
        JPanel listPanel = new JPanel();
        listPanel.setLayout(new GridLayout(3, 2, 5, 5)); // 3 filas, 2 columnas, 5px de espacio

        for (int i = 1; i <= 6; i++) {
            listPanel.add(new JLabel("Elemento " + i));
        }

        // Panel para el botón
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BorderLayout());
        JButton button = new JButton("SALIR");
        buttonPanel.add(button, BorderLayout.EAST);

        // Añadir los paneles al frame principal
        frame.add(titlePanel, BorderLayout.NORTH);
        frame.add(listPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Hacer visible la ventana
        frame.setVisible(true);



        boolean programa=true;
//el do se ejecuta y el while pregunta si se debe volver a ejecutar.
        do{
                MisMetodos.limpiarConsola();
                Baner.mensaje();
                MisMetodos.imprimirLinea();

                ListaOPciones.cargarOpciones(listaDeOpciones);

            //Scanner en este caso esta creando un objeto
            //System imprime en consola un mensaje.
            //int almacena el valor del Scanner(intoOpcion) en formato int(número entero)
            //nextInt() convierte la salida de Scanner en un número entero()
            Scanner intOpcion = new Scanner(System.in);
            System.out.print("[?]: ");
            int opcion = intOpcion.nextInt();
            MisMetodos.imprimirLinea();


            //cargar opcion del usuario
            switch(opcion){
                case 1:
                    Mate.suma();

                    break;
                case 2:
                    IMC.programaIMC();

                    break;
                case 3:
                    ConversorGrados.grados();
                    break;
                case 4:
                    Longitudes.longitud();
                    break;
                case 5:
                    calcularEdad.programa();
                    break;
                case 6:
                    ListadeCompras.crearLista();
                    break;
                case 7:
                    Conversor_monedas.monedas();
                    break;
                case 8:
                    Biblioteca.programa();
                    break;
                case 9:
                    primero_primaria.niños();

                    ;
                    break;
                case 10:
                    programa=false;
                    break;
            }
        }while(programa);
    }
}