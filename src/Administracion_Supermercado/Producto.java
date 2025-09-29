package Administracion_Supermercado;

public class Producto {

    private String nombre;
    private String fechaCaducidad;
    private int numeroLote;

    public Producto() {
    }

    public Producto(String nombre, String fecha_Caducidad, int numero_Lote) {
        this.nombre = nombre;
        this.fechaCaducidad = fecha_Caducidad;
        this.numeroLote = numero_Lote;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fecha_Caducidad) {
        this.fechaCaducidad = fecha_Caducidad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numero_Lote) {
        this.numeroLote = numero_Lote;
    }

    public String mostrarInfo() {
        return "Producto: " + nombre
                + "\n Caducidad: " + fechaCaducidad
                + "\n Lote: " + numeroLote;
    }
    // Versión resumida  (Se aplica sobrecarga  al metodo mostrarInfo) 

    public String mostrarInfo(boolean resumido) {
        if (resumido) {
            return nombre + " (Lote: " + numeroLote + ")";
        } else {
            return mostrarInfo(); // Llama a la versión completa
        }
    }

}
