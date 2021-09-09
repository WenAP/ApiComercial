package Empresa;

public class LocalComercial {
    private double precioAlquiler;
    private String area;
    private Integer cantidadMesesMin;

    public LocalComercial(double precioAlquiler, String area, Integer cantidadMesesMin) {
        this.precioAlquiler = precioAlquiler;
        this.area = area;
        this.cantidadMesesMin = cantidadMesesMin;
    }

    public double calcularAlquilerMin() {
        return this.precioAlquiler * this.cantidadMesesMin;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public String getArea() {
        return area;
    }

    public Integer getCantidadMesesMin() {
        return cantidadMesesMin;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setCantidadMesesMin(Integer cantidadMesesMin) {
        this.cantidadMesesMin = cantidadMesesMin;
    }
}
