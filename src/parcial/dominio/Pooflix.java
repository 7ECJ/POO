package parcial.dominio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Pooflix {
    public static final int CAPACIDAD=15;
    private List<Material> materiales=new ArrayList<>();

    public boolean agregar(Material m) {
        if(materiales.size()<CAPACIDAD && buscar(m.getCodigo())==null){
            return materiales.add(m);
        }
        return false;
    };
    public boolean retirar(int codigo) {
        if(buscar(codigo)!=null){
            materiales.remove(buscar(codigo));
            }
            if(buscar(codigo)==null) {
                return true;
            }
        return false;
    };
    public Material buscar(int codigo){
        for (Material m:materiales) {
            if(m.getCodigo()==codigo){
                return m;
            }
        }
        return null;
    };
    public Material buscar(String nombre){
        for (Material m:materiales) {
            if(m.getNombre()==nombre){
                return m;
            }
        }
        return null;
    };
    public List<Material> buscarPorTipo(String tipo){
        List<Material> coincidentes=new ArrayList<>();
        if(tipo==TipoMaterial.DOCUMENTAL || tipo==TipoMaterial.MATERIAL_INTERACTIVO || tipo==TipoMaterial.MINISERIE || tipo==TipoMaterial.SERIE || tipo==TipoMaterial.PELICULA){
        for(Material m:materiales){
            if(m.getTipo()==tipo){
                coincidentes.add(m);
            }
        }
        }
        return coincidentes;
    };
    public int calcularDuracionTotal(){
        int sumatoria=0;
        for(Material m:materiales){
            sumatoria+=m.getDuracion();
        }
        return sumatoria;
    };
    public List<Material> ordenarPorCodigo(){
        List<Material> ordenado= materiales.stream()
                .sorted(Comparator.comparingInt(Material::getCodigo).reversed())
                .collect(Collectors.toList());
        return ordenado;
    };

}
