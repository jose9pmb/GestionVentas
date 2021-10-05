package com.ceep.domain;

public class Producto {

    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    public Producto() {
        this.idProducto = ++Producto.contadorProductos;
        
        
    }

    public Producto(String nombre, double precio) {
        this();//Para hacer referencia al constructor vació para no duplicar la información
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProductos() {
        return this.idProducto;
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

    public int getContadorProductos() {
        return this.contadorProductos;
    }

    public static void setContadorProductos(int contadorProductos) {
        Producto.contadorProductos = contadorProductos;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + this.nombre + ", precio=" + this.precio + '}';
    }

}
