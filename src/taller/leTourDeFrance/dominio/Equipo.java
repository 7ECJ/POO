package taller.leTourDeFrance.dominio;

import java.util.List;

class Equipo {
    private int id;
    private String nombre;
    private List<Corredor> corredores;

    public Equipo(int id, String nombre, List<Corredor> corredores) {
        this.id = id;
        this.nombre = nombre;
        this.corredores = corredores;
    }

    public void mostrarCorredores(){
        for(Corredor c: corredores){
            System.out.println("Nombre: "+c.getNombre());
            System.out.println("Cedula: "+c.getCedula());
            System.out.println("Edad: "+c.getEdad());
            System.out.println("---------------------------------");
        }
    }

    public void mostrarInfo(){
        System.out.println("id: "+id);
        System.out.println("Nombre: "+nombre);
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getId() {
        return this.id;
    }

    public List<Corredor> getCorredores() {
        return corredores;
    }
}
