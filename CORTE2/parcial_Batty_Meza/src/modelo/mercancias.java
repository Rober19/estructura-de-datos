package modelo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class mercancias implements Serializable {

    static int i = 0;
    String nombre;
    double peso;
    double altura;
    double ancho;
    String color;
    String fechaInspeFisica;
    String fechaRevisionLicImport;
    String fechaImportacion;
    String codigo = (i++) + "";
    String estado = "almacenada";
    String fechaSalidaContainer = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy").format(new Date());

    public mercancias(String nombre, double peso, double altura, double ancho, String color, String fechaInspeFisica, String fechaRevisionLicImport, String fechaImportacion) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.ancho = ancho;
        this.color = color;
        this.fechaInspeFisica = fechaInspeFisica;
        this.fechaRevisionLicImport = fechaRevisionLicImport;
        this.fechaImportacion = fechaImportacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaSalidaContainer() {
        return fechaSalidaContainer;
    }

    public void setFechaSalidaContainer(String fechaSalidaContainer) {
        this.fechaSalidaContainer = fechaSalidaContainer;
    }

    public String getFechaInspeccionFisica() {
        return fechaInspeFisica;
    }

    public void setFechaInspeccionFisica(String fechaInspeccionFisica) {
        this.fechaInspeFisica = fechaInspeccionFisica;
    }

    public String getFechaRevisionLicenciaImportacion() {
        return fechaRevisionLicImport;
    }

    public void setFechaRevisionLicenciaImportacion(String fechaRevisionLicenciaImportacion) {
        this.fechaRevisionLicImport = fechaRevisionLicenciaImportacion;
    }

    public String getFechaImportacion() {
        return fechaImportacion;
    }

    public void setFechaImportacion(String fechaImportacion) {
        this.fechaImportacion = fechaImportacion;
    }

}
