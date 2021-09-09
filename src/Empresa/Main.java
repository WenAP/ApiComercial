package Empresa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Empresa empresaWen = new Empresa();

        Almacen local1 = new Almacen(200,"2m", 6, 12);
        Galeria local2 = new Galeria(200,"2m", 10, 12);
        Galeria local3 = new Galeria(200,"2m", 10, 12);
        TiendaEspecializada local4 = new TiendaEspecializada(200,"2m", 12, "electrónicos");
        TiendaEspecializada local5 = new TiendaEspecializada(200,"2m", 12, "panadería");
        TiendaEspecializada local6 = new TiendaEspecializada(200,"2m", 12, "mueblería");

        empresaWen.registrarLocal(local1);
        empresaWen.registrarLocal(local2);
        empresaWen.registrarLocal(local3);
        empresaWen.registrarLocal(local4);
        empresaWen.registrarLocal(local5);
        empresaWen.registrarLocal(local6);


        // D
        List<LocalComercial> localRegistrados = empresaWen.getLocales();
        for (LocalComercial local: localRegistrados) {
            System.out.println(local.getPrecioAlquiler() + " " +
                    local.getArea() + " " +
                    local.getCantidadMesesMin() + " " +
                    " Tiene un precio de alquiler mínimo de S/" + local.calcularAlquilerMin());
        }
    }

}
