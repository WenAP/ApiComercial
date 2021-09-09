package Empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Empresa {
    private List<LocalComercial> locales;

    public Empresa() { this.locales = new ArrayList<>(); }

    public List<LocalComercial> getLocales() { return locales; }

    public boolean registrarLocal(LocalComercial local) {
            locales.add(local);
            return true;
    }
}
