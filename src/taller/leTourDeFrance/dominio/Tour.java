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
        this.etapas = etapas;
        this.equipos = equipos;
    }

    public void mostrarEquipos(){
        if(equipos.size()<=5) {
            System.out.println("Equipos participantes");
            System.out.println("---------------------------");
            for (Equipo e : equipos) {
                e.mostrarInfo();
            }
        }
        else{
            System.out.println("Hay más de 5 equipos registrados, eso no esta permitido");
        }
    }

    public void mostrarResultados(Etapa e) {
        if (etapas.size() <= 21) {
            for (Etapa et : etapas) {
                if (et==e){
                    System.out.println(" Resultados ");
                    System.out.println("---------------");
                    System.out.println(et.getResultado());
                    break;
                }
            }
            System.out.println("Etapa no encontrada");
        }
    }
    public void mostrarCorredores(Equipo e){
        for(Equipo eq:equipos) {
            if(eq==e){
               eq.mostrarCorredores();
               break;
        }
     }
        System.out.println("Equipo no encontrado");
    }

    public void mostrarTabla(){
        List<Integer> mejoresPuntuaciones;
        mejoresPuntuaciones=new ArrayList<>();
        for (Equipo e: equipos) {
            for(Corredor c:e.getCorredores()){
            mejoresPuntuaciones.add(c.getPuntaje());
            }
        }
        Collections.sort(mejoresPuntuaciones);
        System.out.println("Top 10");
        System.out.println("----------------------");
        for(int i=0;i<10 && i<mejoresPuntuaciones.size();i++){
            System.out.println(i+1);
            System.out.println(mejoresPuntuaciones.get(i));
            System.out.println("--------------------------------");
        }
        }

}