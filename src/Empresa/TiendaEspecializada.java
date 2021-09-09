package Empresa;

public class TiendaEspecializada extends LocalComercial {
    private String tiposProductos;

    public TiendaEspecializada(double precioAlquiler, String area, Integer cantidadMesesMin, String tiposProductos) {
        super(precioAlquiler, area, cantidadMesesMin);
        this.tiposProductos = tiposProductos;
    }

    @Override
    public double calcularAlquilerMin() {
        double montoAlquiler =  super.calcularAlquilerMin();
        switch (this.tiposProductos)
        {
            case "panadería":
                montoAlquiler = montoAlquiler + (montoAlquiler*0.05);
                ;
            case "mueblería":
                montoAlquiler = montoAlquiler + (montoAlquiler*0.07);
                ;
            case "electrónicos":
                montoAlquiler = montoAlquiler + (montoAlquiler*0.09);
                ;
            default:
                //nada
                ;
        }
        return montoAlquiler;
    }

    public String getTiposProductos() {
        return tiposProductos;
    }

    public void setTiposProductos(String tiposProductos) {
        this.tiposProductos = tiposProductos;
    }
}
