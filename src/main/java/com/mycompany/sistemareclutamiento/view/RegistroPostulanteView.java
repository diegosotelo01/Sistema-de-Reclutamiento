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
        setSize(456, 521);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        lblEmail = new JLabel("Email:");
        lblEmail.setBounds(18, 47, 32, 14);
        add(lblEmail);
        txtEmail = new JTextField();
        txtEmail.setBounds(139, 44, 271, 20);
        add(txtEmail);

        lblNombres = new JLabel("Nombres:");
        lblNombres.setBounds(18, 82, 55, 14);
        add(lblNombres);
        txtNombres = new JTextField();
        txtNombres.setBounds(139, 79, 271, 20);
        add(txtNombres);

        lblApellidos = new JLabel("Apellidos:");
        lblApellidos.setBounds(18, 117, 54, 14);
        add(lblApellidos);
        txtApellidos = new JTextField();
        txtApellidos.setBounds(139, 114, 271, 20);
        add(txtApellidos);

        lblDireccion = new JLabel("Dirección:");
        lblDireccion.setBounds(18, 152, 57, 14);
        add(lblDireccion);
        txtDireccion = new JTextField();
        txtDireccion.setBounds(139, 149, 271, 20);
        add(txtDireccion);

        lblNacimiento = new JLabel("Nacimiento:");
        lblNacimiento.setBounds(18, 187, 67, 14);
        add(lblNacimiento);
        txtNacimiento = new JTextField();
        txtNacimiento.setBounds(139, 184, 271, 20);
        add(txtNacimiento);

        lblGrado = new JLabel("Grado:");
        lblGrado.setBounds(18, 222, 37, 14);
        add(lblGrado);
        cmbGrado = new JComboBox<>(new String[]{"Secundaria", "Técnico", "Bachiller", "Licenciatura", "Maestría"});
        cmbGrado.setBounds(139, 219, 271, 20);
        add(cmbGrado);

        btnRegistrar = new JButton("REGISTRAR");
        btnRegistrar.setBounds(161, 257, 89, 23);
        add(btnRegistrar);

        txtResultado = new JTextArea();
        txtResultado.setEditable(false);
        JScrollPane scroll = new JScrollPane(txtResultado);
        scroll.setBounds(18, 294, 392, 178);
        add(scroll);
    }

}
