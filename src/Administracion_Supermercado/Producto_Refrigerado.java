package Administracion_Supermercado;


public class Producto_Refrigerado extends Producto {

    private String codigo_Organismo;

    public Producto_Refrigerado() {
    }

    public Producto_Refrigerado(String nombre, String fechaCaducidad, int numeroLote,
            String codigoOrganismoSuper) {
        super(nombre, fechaCaducidad, numeroLote);
        this.codigo_Organismo = codigoOrganismoSuper;
    }
    
    public String getCodigoOrganismoSupervision() {
        return codigo_Organismo;
    }

    public void setCodigoOrganismoSupervision(String codigoOrganismoSuper) {
        this.codigo_Organismo = codigoOrganismoSuper;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo()
                + "\n bCódigo de supervisión: " + codigo_Organismo;
    }
}
