package taller.leTourDeFrance.dominio;

public class Etapa {
    private String nombre;
    private String resultado;

    public Etapa(String nombre, String resultado) {
        this.nombre = nombre;
        this.resultado = resultado;
    }

    public String getResultado() {
        return this.resultado;
    }

    public String getNombre() {
        return this.nombre;
    }

}
