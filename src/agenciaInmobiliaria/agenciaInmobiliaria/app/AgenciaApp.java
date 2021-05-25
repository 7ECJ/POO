package agenciaInmobiliaria.app;

import agenciaInmobiliaria.dominio.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AgenciaApp {
    public static void main(String[] args) {
        boolean activo=true;
        Agencia cristal=new Agencia();
        cristal.setNombre("Cristal Soluciones Inmobiliarias");
        Casa primera=new Casa();
        primera.setDireccion("Calle 1 #2-12");
        primera.setValorArriendo(200000);
        primera.setValorVenta(90000000);
        Apartamento segundo= new Apartamento();
        segundo.setDireccion("Calle 2 #43-90");
        segundo.setValorArriendo(400000);
        segundo.setValorVenta(100000000);
        Lote tercero=new Lote();
        tercero.setValorVenta(900000000);
        tercero.setDireccion("Carrera 2 #43-89");
        List <Inmueble> in= Arrays.asList(primera,
                segundo,
                tercero);
        in.forEach(i->cristal.agregarInmueble(i));
        /*Tendria que dar true*/
        System.out.println(cristal.arrendar(primera));
        /*Tendria que dar false*/
        System.out.println(cristal.arrendar(primera));
        /*Tendria que dar true*/
        System.out.println(cristal.devolver(primera));
        /*Tendria que dar false*/
        System.out.println(cristal.devolver(primera));
        /*Descomentando esto deberia dar error, pues los lotes no implementan la interfaz Arrendable:
         System.out.println(cristal.arrendar(tercero));*/
        System.out.println("Inmuebles disponibles: ");
        cristal.getArrendablesDisponibles().forEach(i-> System.out.println(i.toString()));
        System.out.println("Inmuebles arrendados: ");
        cristal.getArrendados().forEach(i-> System.out.println(i.toString()));

    }
}
