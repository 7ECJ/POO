package Desafio_2.dominio;

public class Directo extends Empleado{
    private long salario;
    public Directo(String nombre, long salario){
        super(nombre);
        this.salario=salario;
    }
    public long calcularSalud(){
        return (long)(salario*0.07);
    }
    public long calcularPension(){
        return (long)(salario*0.065);
    }

    @Override
    protected long calcularSalario() {
        salario-=(calcularSalud()+calcularPension());
        return salario;
    }

    public long getSalario() {
        return salario;
    }
}
