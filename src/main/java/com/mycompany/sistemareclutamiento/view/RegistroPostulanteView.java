package com.mycompany.sistemareclutamiento.view;

import javax.swing.*;

public class RegistroPostulanteView extends JFrame {

    private JLabel lblEmail, lblNombres, lblApellidos, lblDireccion, lblNacimiento, lblGrado;
    private JTextField txtEmail, txtNombres, txtApellidos, txtDireccion, txtNacimiento;
    private JComboBox<String> cmbGrado;
    private JButton btnRegistrar;
    private JTextArea txtResultado;

    public RegistroPostulanteView() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Sistema de Reclutamiento - Registro de Postulante");
        setSize(450, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

}
