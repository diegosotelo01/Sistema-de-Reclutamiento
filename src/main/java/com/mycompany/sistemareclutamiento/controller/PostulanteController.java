package com.mycompany.sistemareclutamiento.controller;

import com.mycompany.sistemareclutamiento.model.Postulante;
import com.mycompany.sistemareclutamiento.view.RegistroPostulanteView;
import java.util.ArrayList;
import java.util.List;

public class PostulanteController {

    private RegistroPostulanteView vista;
    private List<Postulante> postulantes;

    public PostulanteController(RegistroPostulanteView vista) {
        this.vista = vista;
        this.postulantes = new ArrayList<>();
    }

    public void registrarPostulante() {
    }

}
