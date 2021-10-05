
package com.ceep.ventas;

import com.ceep.domain.*;


public class GestionVentas {
    
    public static void main(String[] args) {
       Producto prod1 = new Producto("Peras", 5.6);
       Producto prod2 = new Producto("Manzanas",6.4);
       Producto prod3 = new Producto("Banana", 7);
       Orden pedido1 = new Orden();
       pedido1.agregarProducto(prod3);
       pedido1.agregarProducto(prod2);
       pedido1.MostrarOrden();
       Orden pedido2 = new Orden();
      
    }
    
}
