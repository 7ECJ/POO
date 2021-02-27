package dispensadorDePapel.app;
import dispensadorDePapel.dominio.DispensadorDePapel;

public class AplicacionDispensador{
    public static void main(String[] args) {
        DispensadorDePapel bañoBloqueA;
        bañoBloqueA = new DispensadorDePapel();
        System.out.println(bañoBloqueA.limpiar());
    }
}