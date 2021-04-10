package parcial.dominio;

public class Material {
    private int codigo, duracion;
    private String nombre, tipo;

    public Material(int codigo, int duracion, String nombre, String tipo) {
        this.codigo = codigo;
        this.duracion = duracion;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public boolean setTipo(String t){
        if(tipo==TipoMaterial.DOCUMENTAL || tipo==TipoMaterial.MATERIAL_INTERACTIVO || tipo==TipoMaterial.MINISERIE || tipo==TipoMaterial.SERIE || tipo==TipoMaterial.PELICULA){
            tipo=t;
            return true;
        }
        else{
            return false;
        }
    }
    public int getCodigo() {
        return codigo;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }
}
