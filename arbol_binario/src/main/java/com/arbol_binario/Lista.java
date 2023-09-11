package com.arbol_binario;

public class Lista<T> implements ILista<T> {

    private Nodo<T> primero;

    public Lista() {
        primero = null;
    }

    @Override
    public void insertar(Nodo<T> nodo) {
        if (nodo == null || nodo.getSiguiente() != null) {
            throw new IllegalArgumentException("El nodo ya esta en otra lista");
        }
        if (primero == null) {
            primero = nodo;
        } else {
            nodo.setSiguiente(primero);
            primero = nodo;
        }
    }
    public void insertarOrdenado(Nodo<T> nodo){
        // TODO: insercion ordenada
        if(nodo == null) 
    }

    @Override
    public Nodo<T> buscar(Comparable clave) {
        Nodo<T> nodoActual = primero;
        while(nodoActual != null){
            if(nodoActual.getEtiqueta().equals(clave)){
                return nodoActual;
            }
            nodoActual = nodoActual.getSiguiente();
        }
        return null;
    }
    public Nodo<T> getPrimero(){
        return primero;
    }
    @Override
    public boolean eliminar(Comparable clave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

    @Override
    public String imprimir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimir'");
    }

    @Override
    public String imprimir(String separador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimir'");
    }

    @Override
    public int cantElementos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cantElementos'");
    }

    @Override
    public boolean esVacia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'esVacia'");
    }

    @Override
    public void setPrimero(Nodo<T> unNodo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPrimero'");
    }

    // implementar los metodos indicados en la interfaz
}
