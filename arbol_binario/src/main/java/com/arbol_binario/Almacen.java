package com.arbol_binario;

public class Almacen implements IAlmacen{

    private String nombre;
    private Lista<IProducto> listaProductos;
    private long stock;
    private String dirrecion;
    private String telefono;

    public Almacen(String nombre){
        this.nombre = nombre;
        this.listaProductos = new Lista<IProducto>();
        this.stock = 0;
    }
    @Override
    public String getDireccion() {
        return dirrecion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.dirrecion = direccion;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(String _telefono) {
        this.telefono = _telefono;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public Lista<IProducto> getListaProductos() {
        return listaProductos;
    }

    @Override
    public long obtenerValorStock() {
        return stock;
    }

    @Override
    public void insertarProducto(IProducto unProducto) {
        listaProductos.insertar(
            new Nodo<IProducto>(unProducto.getCodProducto(), unProducto)
        );
    }

    @Override
    public boolean eliminarProducto(Comparable codProducto) {
        return listaProductos.eliminar(codProducto);
    }

    @Override
    public String imprimirProductos() {
        return listaProductos.imprimir();
    }

    @Override
    public String imprimirSeparador(String separador) {
        return listaProductos.imprimir(separador);
    }

    @Override
    public Boolean agregarStock(Comparable codProducto, Integer cantidad) {
        IProducto producto = buscarPorCodigo(codProducto);
        if(producto == null){
            return false;
        }
        producto.agregarCantidadStock(cantidad);
        return true;
    }

    @Override
    public Integer restarStock(Comparable codProducto, Integer cantidad) {
        IProducto producto = buscarPorCodigo(codProducto);
        if(producto == null){
            return 0;
        }
        producto.restarCantidadStock(cantidad);
        return producto.getStock();
    }

    @Override
    public IProducto buscarPorCodigo(Comparable codProducto) {
        return listaProductos.buscar(codProducto).getDato();
    }

    @Override
    public void listarOrdenadoPorNombre() {
            // armar la lista denuevo pero ordenada por nombre e imprimir
            ILista listaOrdenada = new Lista<>();
            Nodo<IProducto> current = listaProductos.getPrimero();
            Nodo<IProducto> newCurrent = null;
            while (current != null) {
                IProducto producto = current.getDato();
                while (newCurrent != null) {
                    if(producto.getNombre().compareTo(newCurrent.getDato().getNombre()) > 0){

                    }
                    current = current.getSiguiente();
                }
            }
    }


    @Override
    public IProducto buscarPorDescripcion(String descripcion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorDescripcion'");
    }

    @Override
    public int cantidadProductos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cantidadProductos'");
    }
    
}
