package taller.leTourDeFrance.dominio;

public class Etapa {
    private String nombre;
    private String resultado;
    private Tour tour;

    public Etapa(String nombre, String resultado, Tour tour) {
        this.nombre = nombre;
        this.resultado = resultado;
        this.tour=tour;
    }

    public String getResultado() {
        return this.resultado;
    }

    public String getNombre() {
        return this.nombre;
    }

}
