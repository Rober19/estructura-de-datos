
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import javax.swing.table.DefaultTableModel;
import modelo.mercancias;

public class controlador {

    Stack<mercancias> MercanciasDelContainer = new Stack();
    List<mercancias> Listos_nacionalizados = new ArrayList();

    Queue<mercancias> ColaInspec = new LinkedList();
    Queue<mercancias> ColaRevis = new LinkedList();
    Queue<mercancias> ColaImpor = new LinkedList();

    public Stack<mercancias> getMercanciasDelContainer() {
        return MercanciasDelContainer;
    }

    public void setMercanciasDelContainer(Stack<mercancias> MercanciasDelContainer) {
        this.MercanciasDelContainer = MercanciasDelContainer;
    }

    public List<mercancias> getListos_nacionalizados() {
        return Listos_nacionalizados;
    }

    public void setListos_nacionalizados(List<mercancias> Listos_nacionalizados) {
        this.Listos_nacionalizados = Listos_nacionalizados;
    }

    public Queue<mercancias> getColaInspec() {
        return ColaInspec;
    }

    public void setColaInspec(Queue<mercancias> ColaInspec) {
        this.ColaInspec = ColaInspec;
    }

    public Queue<mercancias> getColaRevis() {
        return ColaRevis;
    }

    public void setColaRevis(Queue<mercancias> ColaRevis) {
        this.ColaRevis = ColaRevis;
    }

    public Queue<mercancias> getColaImpor() {
        return ColaImpor;
    }

    public void setColaImpor(Queue<mercancias> ColaImpor) {
        this.ColaImpor = ColaImpor;
    }
    
    

    public Stack<String[]> toAlmacenados() {
        Stack<String[]> pila = new Stack();
        MercanciasDelContainer.forEach(it -> {
            pila.add(new String[]{it.getCodigo(), it.getNombre(), it.getPeso() + "", it.getAltura() + "", it.getColor()});
        });
        return pila;
    }

    public Stack<String[]> toImportados() {
        Stack<String[]> pila = new Stack();
        Listos_nacionalizados.forEach(it -> {
            pila.add(new String[]{
                it.getCodigo(), it.getNombre(), it.getFechaSalidaContainer(), it.getFechaInspeccionFisica(), it.getFechaRevisionLicenciaImportacion(), it.getFechaImportacion()
            });
        });
        return pila;
    }


    public void listar(DefaultTableModel table, Stack<String[]> list) {
        table.setNumRows(0);
        for (Object g1 : list) {
            table.addRow((Object[]) g1);
        }
    }

    public String TiempoEnGestion() {
        return new SimpleDateFormat("HH:mm:ss dd/MM/yyyy ").format(new Date());
    }

}
