//importar del nombre paquete.nombreClase
import Libros.Biblioteca;
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

//importar de nombreLibreria.Nombrepaquete.NombreClase
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
                    System.out.println("opción 9");
                    break;
                case 10:
                    programa=false;
                    break;
            }
        }while(programa);
    }
}