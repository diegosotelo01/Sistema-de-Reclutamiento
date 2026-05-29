package com.mycompany.sistemareclutamiento.controller;

import com.mycompany.sistemareclutamiento.model.Oferta;
import com.mycompany.sistemareclutamiento.view.OfertaView;
import java.util.ArrayList;
import java.util.List;

public class OfertaController {

    private OfertaView vista;
    private List<Oferta> ofertas;

    public OfertaController(OfertaView vista) {
        this.vista = vista;
        this.ofertas = new ArrayList<>();
    }

    public void agregarOferta() {
    }

}
