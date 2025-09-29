package Administracion_Supermercado;


public class Producto_Congelado extends Producto {

    private double temperatura_Congelacion;

    public Producto_Congelado() {
    }

    public Producto_Congelado(String nombre, String fechaCaducidad, int numeroLote,
            double temperaturaCon_Recomendada) {
        super(nombre, fechaCaducidad, numeroLote);
        this.temperatura_Congelacion = temperaturaCon_Recomendada;
    }

    public double getTemperaturaCongelacionRecomendada() {
        return temperatura_Congelacion;
    }

    public void setTemperaturaCongelacionRecomendada(double temperaturaCon_Recomendada) {
        this.temperatura_Congelacion = temperaturaCon_Recomendada;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo()
                + "\n Temperatura de congelación: " + temperatura_Congelacion + "°C";
    }
}
