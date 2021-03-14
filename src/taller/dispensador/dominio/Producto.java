package taller.dispensador.dominio;

 class Producto {
    private int id, cantidad;
    private String nombre;
    private float precio;

     public Producto(int id, int cantidad, String nombre, float precio) {
         this.id = id;
         if(cantidad<=8) {
             this.cantidad = cantidad;
         }
         else{
             System.out.println("No puedes tener mas de 8 unidades de un producto");
         }
         this.nombre = nombre;
         this.precio = precio;
     }

     public int getId() {
        return this.id;
    }

    protected void setCantidad(int cantidad) {
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
