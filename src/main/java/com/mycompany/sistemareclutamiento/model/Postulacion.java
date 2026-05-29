package com.mycompany.sistemareclutamiento.model;

import java.util.Date;

public class Postulacion {

    private Date fecha;
    private boolean anulado;
    private Date fechaAnulacion;
    private Oferta oferta;
    private Postulante postulante;

    public Postulacion(Date fecha, Oferta oferta, Postulante postulante) {
        this.fecha = fecha;
        this.oferta = oferta;
        this.postulante = postulante;
        this.anulado = false;
    }

    public Date getFecha() { return fecha; }
    public boolean isAnulado() { return anulado; }
    public Date getFechaAnulacion() { return fechaAnulacion; }
    public Oferta getOferta() { return oferta; }

    public void setAnulado(boolean anulado) { this.anulado = anulado; }
    public void setFechaAnulacion(Date fechaAnulacion) { this.fechaAnulacion = fechaAnulacion; }

}
