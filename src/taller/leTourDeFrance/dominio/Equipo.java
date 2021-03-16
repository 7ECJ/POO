package taller.leTourDeFrance.dominio;

import java.util.ArrayList;
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

    public List<String> mostrarCorredores(){
        List<String> infoCorredores=new ArrayList<>();
        for(Corredor c: corredores){
            infoCorredores.add("Nombre: "+c.getNombre()+ " Cedula: "+ c.getCedula()+ " Edad: "+ c.getEdad()+"\n---------------------------");
        }
        return infoCorredores;
    }
    public String mostrarInfo(){
        return("ID: "+id+ "Nombre: "+ nombre);
    }
    public String getNombre(){

        return this.nombre;
    }
    public List<Corredor> getCorredores() {
        return corredores;
    }
}
