package dispensadorDePapel.dominio;

public class DispensadorDePapel {
    int id;
    String marca;
    String tipoDePapel;
    float capacidadMetros;
    String materialCarcasa;
    float cantidadActualMetros;
    int diasDesdeUltimaLimpieza;

    public String limpiar() {
        return ("Gracias, ya me hacia falta");
    }

    public String mostrarFichaTecnica() {
        return (
                "Ficha tecnica:" +
                        "\nID: " + this.id +
                        "\nMarca: " + this.marca +
                        "\nTipo de Papel: " + this.tipoDePapel +
                        "\nCapacidad Metros: " + this.capacidadMetros +
                        "\nMaterial Carcasa: " + this.materialCarcasa +
                        "\nCantidad Actual: " + this.cantidadActualMetros +
                        "\nDias Desde Ultima Limpieza: " + this.diasDesdeUltimaLimpieza
        );
    }

    public String cargarPapel() {
        return ("Gracias por llenar mi vacio existencial");
    }

    public String cambiarCapacidad(float nuevaCapacidad) {
        return ("Ahora puedo almacenar " + nuevaCapacidad + " metros");
    }

    public boolean revisarPapel() {
        if (cantidadActualMetros > 0) {
            return (true);
        } else {
            return (false);
        }
    }
}