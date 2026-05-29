package com.mycompany.sistemareclutamiento.view;

import javax.swing.*;

public class OfertaView extends JFrame {

    private JLabel lblPuesto, lblDescripcion, lblArea, lblFechaInicio, lblFechaTermino;
    private JTextField txtPuesto, txtDescripcion, txtArea, txtFechaInicio, txtFechaTermino;
    private JButton btnAgregar;
    private JTextArea txtResultado;

    public OfertaView() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Sistema de Reclutamiento - Publicar Oferta");
        setSize(450, 430);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

}
