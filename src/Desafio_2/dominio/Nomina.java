package Desafio_2.dominio;

import java.util.ArrayList;
import java.util.List;

public class Nomina {
    private List<Empleado> empleados=new ArrayList<>();

    public void calcularNomina(){
        empleados.forEach(empleado->{
            System.out.println("Salario de "+empleado.getNombre()+": "+empleado.calcularSalario());
        });
    }
    public void listarDirectos(){
        System.out.println("Empleados Directos: ");
        empleados.forEach(e->{
            if(e instanceof Directo){
                System.out.println(e.getNombre());
            }
        });
    }
    public void listarFreelancers(){
        System.out.println("Empleados Freelancers: ");
        empleados.forEach(e->{
            if(e instanceof Freelance){
                System.out.println(e.getNombre());            }
        });
    }
    public void listarPromotores(){
        System.out.println("Empleados Promotores: ");
        empleados.forEach(e->{
            if(e instanceof Promotor){
                System.out.println(e.getNombre());            }
        });
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
}
