package firstrepgestionproductos;
import com.ceep.domain.*;
/**
 *
 * @author braya
 */
public class FirstRepGestionProductos {
    
    public static void main(String[] args) {
        
        Producto p1 = new Producto("Crema Dental",2.99);
        Producto p2 = new Producto("Cepillo de dientes",3.99);
        Producto p3 = new Producto("Gel de baño",6.99);
        Producto p4 = new Producto("Hilo dental",1.99);
        Producto p5 = new Producto("Desodorante",2.99);
        Producto p6 = new Producto("Listerine",7.99);
        
        Orden o1 = new Orden();
        o1.anadirProducto(p1);
        o1.anadirProducto(p2);
        o1.anadirProducto(p3);
        o1.anadirProducto(p4);
        
        System.out.println(o1);
        System.out.println(o1.calcularTotal());
        
        Orden o2 = new Orden();
        o2.anadirProducto(p5);
        o2.anadirProducto(p6);
        
        System.out.println(o2);
        System.out.println(o2.calcularTotal());
    }
    
}
