package Desafio_2.dominio;

public class Promotor extends Empleado{
    private int volantesRepartidos, comprasVolante;
    private long valorVolante;
    public Promotor(String nombre, int volantesRepartidos, long valorVolante, int comprasVolante){
        super(nombre);
        this.comprasVolante=comprasVolante;
        this.valorVolante=valorVolante;
        this.volantesRepartidos=volantesRepartidos;
    }

    @Override
    protected long calcularSalario() {
        return volantesRepartidos*valorVolante+17000*comprasVolante;
    }
}
