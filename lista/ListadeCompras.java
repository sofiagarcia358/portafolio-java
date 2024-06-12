package lista;

import mis_metodos.ListaOPciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadeCompras {

    public static String [] opciones6 ={"Lista de compras", "salir"};

    //programa inicial
    public static void compras() {
        ListaOPciones.cargarOpciones(opciones6);

        Scanner opcion = new Scanner(System.in);
        System.out.print("[?]: ");
        int r = opcion.nextInt();

        switch (r) {
            case 1:
                crearLista();
                break;
            case 2:
                System.out.println("Salir");
                break;
        }
    }

    //crear lista vacia
    public static void crearLista(){
        List<String> listaNombre =new ArrayList<>();
        List<Double> listaPrecio =new ArrayList<>();

    //pedir producto y precio
        String rP;
        double rPc;

        for(int i = 1; i<=3;i++) {
            Scanner item =new Scanner(System.in);
            System.out.print("producto: ");
            rP = item.nextLine();
            System.out.print("Precio: ");
            rPc = item.nextDouble();

            listaNombre.add(rP);
            listaPrecio.add(rPc);
        }

        //MOSTRAR LISTA

        System.out.println(listaNombre + "--->"+listaPrecio);

        }
    }


