package controller;

import model.prenda;
import java.util.Vector;

public class prendaController {

    private static Vector<prenda> list_prendas = new Vector();

    public prendaController() {
    }

    public void create(prenda P) {
        list_prendas.add(P);
    }

    public Vector<prenda> getList_byEstado(String Estado) {
        Vector<prenda> list_asEstado = new Vector();
        list_prendas.forEach(p -> {
            if (p.getEstado().equals(Estado)) {
                list_asEstado.add(p);
            }
        });
        return list_asEstado;
    }

    public void change_Estado(String Estado, String Codigo) {
        list_prendas.forEach(Prenda -> {
            if (Prenda.getCodigo().equals(Codigo)) {
                Prenda.setEstado(Estado);
            }
        });
    }

}
