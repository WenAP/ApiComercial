package Empresa;

public class Galeria extends LocalComercial {
    private Integer cantidadPuestos;

    public Galeria(double precioAlquiler, String area, Integer cantidadMesesMin, Integer cantidadPuestos) {
        super(precioAlquiler, area, cantidadMesesMin);
        this.cantidadPuestos = cantidadPuestos;
    }

    @Override
    public double calcularAlquilerMin() {
        double montoAlquiler = super.calcularAlquilerMin();
        if (this.cantidadPuestos > 10) {
            return montoAlquiler + (montoAlquiler*0.1);
        }
        return montoAlquiler;
    }

    public Integer getCantidadPuestos() {
        return cantidadPuestos;
    }

    public void setCantidadPuestos(Integer cantidadPuestos) {
        this.cantidadPuestos = cantidadPuestos;
    }
}
