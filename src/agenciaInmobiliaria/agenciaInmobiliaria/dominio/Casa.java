package agenciaInmobiliaria.dominio;

public class Casa extends Inmueble implements Arrendable{
    @Override
    public boolean arrendar() {
        if(this.isArrendado()){
            return false;
        }
        this.setArrendado(true);
        return true;
    }

    @Override
    public boolean devolver() {
        if(this.isArrendado()){
            this.setArrendado(false);
            return true;
        }
        return false;
    }

}
