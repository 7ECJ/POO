package taller.leTourDeFrance.dominio;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tour {
    private int id;
    private List<Etapa> etapas=new ArrayList<>();
    private List<Equipo> equipos= new ArrayList<>();

    public Tour(int id, List<Etapa> etapas, List<Equipo> equipos) {
        this.id = id;
        if(etapas.size()==21){
            this.etapas = etapas;
        }
        else{
            System.out.println("No un numero diferente a 21 etapas");
        }
        if(equipos.size()<=5 && equipos.size()>=1) {
            this.equipos = equipos;
        }
        else{
            System.out.println("No puedes tener mas de 5 equipos");
        }
    }

    public List<String> mostrarEquipos(){
        List<String> equiposInfo=new ArrayList<>();
            for (Equipo e : equipos) {
                equiposInfo.add(e.mostrarInfo());
            }
            return equiposInfo;
    }
    public String mostrarResultados(Etapa e) {
            for (Etapa et : etapas) {
                if (et==e){
                    return et.getResultado();
                }
    }
            return null;
    }
    public List<String> mostrarCorredores(Equipo e){
        for(Equipo eq:equipos) {
            if(eq==e){
               return eq.mostrarCorredores();
        }
     }
        return null;
    }
    public List<Integer> mostrarTabla(){
        List<Integer> mejoresPuntuaciones=new ArrayList<>();
        List<Integer> puntuaciones=new ArrayList<>();
        for (Equipo e: equipos) {
            for(Corredor c:e.getCorredores()){
            puntuaciones.add(c.getPuntaje());
            }
        }
        Collections.sort(puntuaciones);
        for(int i=puntuaciones.size();mejoresPuntuaciones.size()<=10;i--){
            mejoresPuntuaciones.add(puntuaciones.get(i));
        }
        return mejoresPuntuaciones;
        }

}