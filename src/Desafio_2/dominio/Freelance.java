package Desafio_2.dominio;

public class Freelance extends Empleado{
    int horasTrabajadas;
    long valorHora;

    public Freelance(String nombre, long valorHora, int horasTrabajadas){
        super(nombre);
        this.valorHora=valorHora;
        this.horasTrabajadas=horasTrabajadas;
    }

    @Override
    protected long calcularSalario() {
        return horasTrabajadas*valorHora;
    }

}
