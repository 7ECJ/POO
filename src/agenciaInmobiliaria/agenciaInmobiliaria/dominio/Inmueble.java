package agenciaInmobiliaria.dominio;

public abstract class Inmueble {
    private String direccion;
    private long valorVenta, valorArriendo;
    private boolean arrendado;

    public String getDireccion() {
        return direccion;
    }

    public long getValorVenta() {
        return valorVenta;
    }

    public long getValorArriendo() {
        return valorArriendo;
    }

    public boolean isArrendado() {
        return arrendado;
    }


    public void setValorArriendo(long valorArriendo) {
        this.valorArriendo = valorArriendo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setValorVenta(long valorVenta) {
        this.valorVenta = valorVenta;
    }

    public void setArrendado(boolean arrendado) {
        this.arrendado = arrendado;
    }

    @Override
    public String toString() {
        if(this instanceof  Arrendable){
        return "Informacion inmueble: \n" +
                "Direccion: "+this.getDireccion()+"\n" +
                "Valor Venta: "+this.getValorVenta()+"\n" +
                "Valor Arriendo: "+this.getValorArriendo()+ "\n" +
                "Está arrendado: "+this.isArrendado();
        }
        return "Informacion inmueble: \n" +
                "Direccion: "+this.getDireccion()+"\n" +
                "Valor Venta: "+this.getValorVenta()+"\n";
    }
}
