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

    public String getRuc() { return ruc; }
    public String getRazonSocial() { return razonSocial; }
    public String getEmail() { return email; }
    public String getContacto() { return contacto; }
    public String getTelefono() { return telefono; }
    public void setClave(String clave) { this.clave = clave; }
    public Rubro getRubro() { return rubro; }

    public boolean agregarOferta(Oferta oferta) {
        ofertas.add(oferta);
        return true;
    }

    public boolean eliminarOferta(Oferta oferta) {
        return ofertas.remove(oferta);
    }

    public Oferta[] getOfertas() {
        return ofertas.toArray(new Oferta[0]);
    }

}
