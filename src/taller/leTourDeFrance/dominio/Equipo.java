package taller.leTourDeFrance.dominio;

import java.util.List;

class Equipo {
    private int id;
    private String nombre;
    private List<Corredor> corredores;
    private Tour tour;

    public Equipo(int id, String nombre, List<Corredor> corredores, Tour tour) {
        this.id = id;
        this.nombre = nombre;
        if(corredores.size()<=7 && corredores.size()>=1){
            this.corredores=corredores;
        }
        else{
            System.out.println("No puedes tener mas de 7 corredores");
        }
        this.tour=tour;
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
    public List<Corredor> getCorredores() {
        return corredores;
    }
}
