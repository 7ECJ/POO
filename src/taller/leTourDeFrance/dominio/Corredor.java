package taller.leTourDeFrance.dominio;

public class Corredor {
    private int cedula, edad, puntaje;
    private String nombre;

    public Corredor(int cedula, int edad, String nombre, int puntaje) {
        this.cedula = cedula;
        this.edad = edad;
        this.nombre = nombre;
        this.puntaje=puntaje;
    }

    public int getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public int getPuntaje(){
        return puntaje;
    }

    public String getNombre() {
        return nombre;
    }
}
