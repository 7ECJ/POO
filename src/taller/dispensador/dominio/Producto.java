package taller.dispensador.dominio;

 class Producto {
    private int id, cantidad;
    private String fabricante, nombre;
    private float precio;

    public int getId() {
        return this.id;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public float getPrecio() {
        return this.precio;
    }
}
