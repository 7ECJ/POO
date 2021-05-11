package Desafio_2.dominio;

public class Vendedor extends Directo{
    private long ventasDelMes;

    public Vendedor(String nombre, long salario, long ventasDelMes){
        super(nombre, salario);
        this.ventasDelMes=ventasDelMes;
    }

    public long calcularComision(){
        return 0;
    }

    @Override
    protected long calcularSalario() {
        long salario=getSalario();
        if(ventasDelMes<=999999){
            salario+=ventasDelMes*0.05;
        }
        else{
            salario+=ventasDelMes*0.045;
        }
        salario-=calcularSalud()-calcularPension();
        return salario;
    }
}
