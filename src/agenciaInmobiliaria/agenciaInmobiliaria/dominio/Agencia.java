package agenciaInmobiliaria.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Agencia {
    private String nombre;
    private List<Inmueble> inmuebles=new ArrayList<>();

    public void agregarInmueble(Inmueble i){
        inmuebles.add(i);
    };
    public boolean arrendar(Arrendable inmueble){
        return inmueble.arrendar();
    };
    public boolean devolver(Arrendable inmueble){
        return inmueble.devolver();
    };
    public boolean vender(Inmueble inmueble){
        if(!inmueble.isArrendado()){
            inmuebles.remove(inmueble);
            return true;
        }
        return false;
    };
    public List<Inmueble> getArrendablesDisponibles(){
        return inmuebles.stream().filter(inmueble -> !inmueble.isArrendado()).collect(Collectors.toList());
    };
    public List<Inmueble> getArrendados(){
        return inmuebles.stream().filter(inmueble -> inmueble.isArrendado()).collect(Collectors.toList());
    };

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setInmuebles(List<Inmueble> inmuebles) {
        this.inmuebles = inmuebles;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Inmueble> getInmuebles() {
        return inmuebles;
    }
}
