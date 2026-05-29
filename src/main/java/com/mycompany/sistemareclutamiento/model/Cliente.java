package com.mycompany.sistemareclutamiento.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String ruc;
    private String razonSocial;
    private String email;
    private String contacto;
    private String telefono;
    private String clave;
    private Rubro rubro;
    private List<Oferta> ofertas;

    public Cliente(String ruc, String razonSocial, String email, String contacto, String telefono, Rubro rubro) {
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.email = email;
        this.contacto = contacto;
        this.telefono = telefono;
        this.rubro = rubro;
        this.ofertas = new ArrayList<>();
    }

    public boolean agregarOferta(Oferta oferta) { return false; }
    public boolean eliminarOferta(Oferta oferta) { return false; }
    public Oferta[] getOfertas() { return null; }

}
