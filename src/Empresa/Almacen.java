package Empresa;

public class Almacen extends LocalComercial {
    private Integer cantidadTipoProductos;

    public Almacen(double precioAlquiler, String area, Integer cantidadMesesMin, Integer cantidadTipoProductos) {
        super(precioAlquiler, area, cantidadMesesMin);
        this.cantidadTipoProductos = cantidadTipoProductos;
    }

    @Override
    public double calcularAlquilerMin() {
        return super.calcularAlquilerMin();
    }

    public Integer getCantidadTipoProductos() {
        return cantidadTipoProductos;
    }

    public void setCantidadTipoProductos(Integer cantidadTipoProductos) {
        this.cantidadTipoProductos = cantidadTipoProductos;
    }
}
