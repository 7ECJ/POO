package taller.leTourDeFrance.dominio;

import java.util.ArrayList;
import java.util.List;

public class APP {
    public static void main(String[] args) {
        Equipo igneos;
        Etapa uno;
        Tour francia;
        Corredor juan;
        List<Etapa> etapas=new ArrayList<>();
        List<Equipo> equipos= new ArrayList<>();
        List<Corredor> corredores=new ArrayList<>();

        juan=new Corredor(20202, 20, "Juan Reyes", 20);
        corredores.add(juan);
        igneos=new Equipo(9000, "igneos",corredores);
        equipos.add(igneos);
        uno= new Etapa("uno", "Gana el igneos");
        etapas.add(uno);
        francia=new Tour(01, etapas, equipos);

        francia.mostrarTabla();

    }
}
