package taller.dispensador.dominio;

import java.util.ArrayList;
import java.util.List;

public class DispensadorMecato {
    private int id;
    private String fabricante;
    private List<Producto> productos=new ArrayList<>();
    private float saldo;

    public String consultarNombreProducto(int id){
        for (Producto p:productos) {
            if (p.getId()==id) {
                return (p.getNombre());
            }
        }
        return("Producto no encontrado");
    }
    public float consultarPrecioProducto(int id){
        for (Producto p:productos) {
            if (p.getId()==id) {
                return (p.getPrecio());
            }
        }
        return 0;
    }

    public float consultarCantidadProducto(Producto p){
        return p.getCantidad();
    }
    public boolean sacarProductoNombre(String nombre){
        for (Producto p:productos) {
            if(p.getNombre().equals(nombre)){
                if(p.getCantidad()!=0 && saldo>=p.getPrecio()){
                    p.setCantidad(p.getCantidad()-1);
                    saldo-=p.getPrecio();
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public boolean sacarProductoID(int id){
        for (Producto p:productos) {
            if(p.getId()==(id)){
                if(p.getCantidad()!=0 && saldo>=p.getPrecio()){
                    p.setCantidad(p.getCantidad()-1);
                    saldo-=p.getPrecio();
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public void consultarTotalUnidades(){
        for(Producto p:productos){
            System.out.println(p.getNombre()+": "+ p.getCantidad());
        }
    }
    public void consultarAgotados(){
        List<Producto> agotados=new ArrayList<>();

        for(Producto p:productos){
            if(p.getCantidad()==0){
                agotados.add(p);
            }
        }
        System.out.println("Productos agotados: ");
        for(Producto p:agotados){
            System.out.println(p);
        }
    }

    public boolean surtir(Producto p, int cantidad){
        int indice=productos.indexOf(p);
        if(indice==-1){
            if(productos.size()<10 && p.getCantidad()+cantidad<=8){
                p.setCantidad(p.getCantidad()+cantidad);
                productos.add(p);
                return true;
            }
        }
        else if(p.getCantidad()+cantidad<=8){
            p.setCantidad(p.getCantidad()+cantidad);
            return true;
        }
        return false;
    }
}
