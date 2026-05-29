package com.mycompany.sistemareclutamiento.controller;

import com.mycompany.sistemareclutamiento.model.Cliente;
import com.mycompany.sistemareclutamiento.view.RegistroClienteView;
import java.util.ArrayList;
import java.util.List;

public class ClienteController {

    private RegistroClienteView vista;
    private List<Cliente> clientes;

    public ClienteController(RegistroClienteView vista) {
        this.vista = vista;
        this.clientes = new ArrayList<>();
    }

    public void registrarCliente() {
    }

}
