package com.ceep.domain;

/**
 *
 * @author braya
 */
public class Orden {
    
    public static int idOr = 1;
    public static int contOr = 1;
    
    private int idOrden;
    private Producto[] productos;
    private int contadorOrdenes;
    private final int maxProductos = 10;
    
    private int numeroProductos;

    
    public Orden() {
        this.idOrden = idOr++;
        this.productos = new Producto[maxProductos];
        this.contadorOrdenes = contOr++;
        this.numeroProductos = 0;
    }

    
    public void anadirProducto(Producto producto){
        if (numeroProductos < maxProductos) {
                this.productos[numeroProductos] = producto;
                numeroProductos++;   
        } else {
            System.out.println("No cabe mas en tu carrito realiza otra orden.");
        }
    }
    
    public double calcularTotal() {
        double precio = 0;
        for (int i = 0; i < numeroProductos; i++) {
            precio += this.productos[i].getPrecio();
        };
        return precio;
    }
    
    private String mostrarOrden() {
        String cadenaProductos = "";
        for (int i = 0; i < numeroProductos; i++) {
            cadenaProductos += this.productos[i].toString() + "\n";
        }
        return cadenaProductos;
    }

    @Override
    public String toString() {
        return "ID Orden: " + idOrden + "\nNumero de Productos: " + numeroProductos+ "\nTiene los siguientes productos" + mostrarOrden();
    }
    
    
}
