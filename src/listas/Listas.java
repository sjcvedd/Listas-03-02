package listas;

import java.io.*;

class persona{
        String nombre;
        String apellido;
}

class nodo extends persona{
    nodo siguiente;
}

class lista{
    nodo L;
    lista(){
        L = null;
    }
    void crear(String Nombre, String Apellido) {
        if (L==null) {
            L=new nodo();
            L.nombre = Nombre;
            L.apellido = Apellido;
        }else{
            nodo aux = L;
            while (aux.siguiente != null)
                aux=aux.siguiente;
            aux.siguiente = new nodo();
            aux=aux.siguiente;
            aux.nombre = Nombre;
            aux.apellido = Apellido;
        }
    }
}


public class Listas {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String nom,ape;
        int opc=0;
        lista l = new lista();
        do{
            System.out.println("Menu de la Lista");
            System.out.println("1-> Para ingresar un Elemento");
            System.out.println("2-> Para Salir");
            opc = Integer.parseInt(br.readLine()); 
            switch (opc){
                case 1: 
                    System.out.println("Ingrese Nombre");
                    nom=br.readLine();
                    System.out.println("Ingrese Apellido");
                    ape=br.readLine();
                    l.crear(nom, ape);
                    break;
                default:
                    System.out.println("opcion Equivocada");
                    break;
            }
        }while (opc!=2);
    }
    
}
