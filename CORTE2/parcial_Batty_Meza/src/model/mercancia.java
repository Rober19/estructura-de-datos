/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author E304
 */
public class mercancia {
    
     SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();

    private String codigo = UUID.randomUUID()+"";
    private String nombre;
    private double peso;
    private double altura;
    private double ancho;
    private String color;
    private String estado = "Almacenada";
    private String fechaSalidaContainer = formatter.format(date);
    private String fechaInspeccionFisica;
    private String fechaRevisionLicenciaImportacion;
    private String fechaImportacion;

    public mercancia(String nombre, double peso, double altura, double ancho, String color, String fechaInspeccionFisica, String fechaRevisionLicenciaImportacion, String fechaImportacion) {
               this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.ancho = ancho;
        this.color = color;
        this.fechaInspeccionFisica = fechaInspeccionFisica;
        this.fechaRevisionLicenciaImportacion = fechaRevisionLicenciaImportacion;
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
        return fechaInspeccionFisica;
    }

    public void setFechaInspeccionFisica(String fechaInspeccionFisica) {
        this.fechaInspeccionFisica = fechaInspeccionFisica;
    }

    public String getFechaRevisionLicenciaImportacion() {
        return fechaRevisionLicenciaImportacion;
    }

    public void setFechaRevisionLicenciaImportacion(String fechaRevisionLicenciaImportacion) {
        this.fechaRevisionLicenciaImportacion = fechaRevisionLicenciaImportacion;
    }

    public String getFechaImportacion() {
        return fechaImportacion;
    }

    public void setFechaImportacion(String fechaImportacion) {
        this.fechaImportacion = fechaImportacion;
    }

}
