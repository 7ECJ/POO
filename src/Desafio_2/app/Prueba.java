package Desafio_2.app;

import Desafio_2.dominio.*;

import java.util.Arrays;
import java.util.List;

public class Prueba {
    public static void main(String[] args) {
        Nomina nom=new Nomina();
        Empleado juan=new Directo("Juan", 5360000);
        Empleado julian=new Vendedor("Julian", 2450000, 55510000);
        Empleado johanna=new Freelance("Johanna", 76000, 85);
        Empleado carolina=new Vendedor("Carolina", 990000,62487000);
        Empleado david=new Directo("David", 2895000);
        Empleado pedro=new Promotor("Pedro", 1500,250, 48);
        Empleado gustavo=new Freelance("Gustavo", 52500,60);
        List<Empleado> e= Arrays.asList(juan, julian, carolina, johanna, david, pedro, gustavo);
        nom.setEmpleados(e);
        nom.calcularNomina();
        nom.listarDirectos();
        nom.listarFreelancers();
        nom.listarPromotores();
    }
}
