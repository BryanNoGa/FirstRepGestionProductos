package com.ceep.domain;

/**
 *
 * @author braya
 */
public class Producto {
    
    public static int idPro = 1;
    
    private int idProducto; 
    private String nombre;
    private double precio;
    private int contadorProductos = 0;
    
    
    public Producto() {
        this.idProducto=idPro++;
        this.contadorProductos++;
    }

    public Producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "\nID Producto: " + idProducto + "\nNombre: " + nombre + "\nPrecio: " + precio ;
    }

    
    
    
}
