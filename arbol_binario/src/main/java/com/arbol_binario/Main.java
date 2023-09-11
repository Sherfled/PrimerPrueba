package com.arbol_binario;



/**
 *
 * @author ernesto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String path = "UT4-TA2\\src\\claves1.txt";

        String [] claves;
        claves = ManejadorArchivosGenerico.leerArchivo(path); 
        TArbolBB<String> arbol = new TArbolBB<>(); 
        String[] lineaAEscribir = new String[claves.length];
        int i = 0;
        for (String linea : claves) {
            //System.out.println(string);
            TElementoAB<String> nuevoNodo = new TElementoAB<String>(linea, linea);
            arbol.insertar(nuevoNodo);
            lineaAEscribir[i] = nuevoNodo.getEtiqueta().toString() + " Contador: " +  nuevoNodo.contadorIteraciones;
            i++;
        }
        ManejadorArchivosGenerico.escribirArchivo(path + "Rescrito", lineaAEscribir);
        System.out.println(arbol.alturaArbol());
        System.out.println(arbol.hojasArbol());
    }
    
}
