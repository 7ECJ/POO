package taller.dispensador.dominio;

import java.util.ArrayList;
import java.util.List;

public class DispensadorMecato {
    private int id;
    private String fabricante;
    private List<Producto> productos;
    private float saldo;

    public DispensadorMecato(int id, String fabricante, List<Producto> productos, float saldo) {
        this.id = id;
        this.fabricante = fabricante;
        if(productos.size()<=10) {
            this.productos = productos;
        }
        else{
            System.out.println("No puedes tener mas de 10 productos");
        }
        this.saldo = saldo;
    }

    public String consultarNombreProducto(Producto p){
       return p.getNombre();
    }
    public float consultarPrecioProducto(Producto p){
        return p.getPrecio();
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

    public List<String> consultarTotalUnidades(){
        List<String> totales=new ArrayList<>();
        for(Producto p:productos){
            totales.add(p.getNombre()+": "+ p.getCantidad());
        }
        return totales;
    }
    public List<Producto> consultarAgotados(){
        List<Producto> agotados=new ArrayList<>();

        for(Producto p:productos){
            if(p.getCantidad()==0){
                agotados.add(p);
            }
        }
        return agotados;
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
