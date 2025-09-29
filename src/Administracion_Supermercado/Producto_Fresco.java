package Administracion_Supermercado;

public class Producto_Fresco extends Producto {

    private String fechaEnvasado;
    private String paisOrigen;

    public Producto_Fresco() {
    }

    public Producto_Fresco(String nombre, String fechaCaduc, int numeroLote,
            String fechaEnva, String paisOrigen) {
        super(nombre, fechaCaduc, numeroLote);
        this.fechaEnvasado = fechaEnva;
        this.paisOrigen = paisOrigen;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnva) {
        this.fechaEnvasado = fechaEnva;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo()
                + "\n Fecha de envasado: " + fechaEnvasado
                + "\n País de origen: " + paisOrigen;
    }
}
