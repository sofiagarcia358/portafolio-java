//importar del nombre paquete.nombreClase
import Celcius_farenheit.farenheit_celcius;
import Lista.ListadeCompras;
import conversor_moneda.Conversor_monedas;
import interface_grafica.Baner;
import medidas.mediciones;
import opciones.ListaOPciones;
import programas.IMC;
import matematicas.Mate;

//importar de nombreLibreria.Nombrepaquete.NombreClase
import java.util.Scanner;

//método main
public class Main {
    public static void main(String[] args) {

        String[] listaDeOpciones = {
                "Calculadora", "IMC",
                "Farenheit / Celsius", "Medidas",
                "Calcular edad", "Listado",
                "Conversos Monedas", "Opción_8",
                "Opción_9", "Salir" };

        boolean programa=true;
//el do se ejecuta y el while pregunta si se debe volver a ejecutar.
        do{
                //la clase baner.mensaje()(este es un método)
                Baner.mensaje();

                //listaOPciones=clase, .cargarOpciones()=es un metodo.
                ListaOPciones.cargarOpciones(listaDeOpciones);


            //Scanner en este caso esta creando un objeto
            //System imprime en consola un mensaje.
            //int almacena el valor del Scanner(intoOpcion) en formato int(número entero)
            //nextInt() convierte la salida de Scanner en un número entero()
            Scanner intOpcion = new Scanner(System.in);
            System.out.print("[?]: ");
            int opcion = intOpcion.nextInt();
            System.out.println("-------------------------------------------------");

            //cargar opcion del usuario
            switch(opcion){
                case 1:
                    Mate.suma();

                    break;
                case 2:
                    IMC.programaIMC();

                    break;
                case 3:
                    farenheit_celcius.grados();
                    break;
                case 4:
                    mediciones.longitud();
                    break;
                case 5:
                    System.out.println("opción 5");
                    break;
                case 6:
                    ListadeCompras.crearLista();
                    break;
                case 7:
                    Conversor_monedas.monedas();
                    break;
                case 8:
                    System.out.println("opción 8");
                    break;
                case 9:
                    System.out.println("opción 9");
                    break;
                case 10:
                    programa=false;
                    break;
            }
        }while(programa);
    }
}