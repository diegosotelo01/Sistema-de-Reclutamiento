package com.mycompany.sistemareclutamiento.model;

public class Rubro {

    private String nombre;
    private boolean estado;

    public Rubro(String nombre) {
        this.nombre = nombre;
        this.estado = true;
    }

    public String getNombre() { return nombre; }
    public boolean isEstado() { return estado; }

    public boolean habilitar() {
        estado = true;
        return true;
    }

    public boolean deshabilitar() {
        estado = false;
        return true;
    }

}
