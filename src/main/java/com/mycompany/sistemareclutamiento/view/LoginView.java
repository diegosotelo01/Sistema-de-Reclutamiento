package com.mycompany.sistemareclutamiento.view;

import javax.swing.*;

public class LoginView extends JFrame {

    private JLabel lblEmail, lblClave;
    private JTextField txtEmail;
    private JPasswordField txtClave;
    private JButton btnIngresarEmpresa, btnIngresarPostulante, btnRegistrarEmpresa, btnRegistrarPostulante;

    public LoginView() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Sistema de Reclutamiento");
        setSize(374, 231);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        lblEmail = new JLabel("Email:");
        lblEmail.setBounds(18, 47, 32, 14);
        add(lblEmail);
        txtEmail = new JTextField();
        txtEmail.setBounds(139, 44, 191, 20);
        add(txtEmail);

        lblClave = new JLabel("Contraseña:");
        lblClave.setBounds(18, 82, 70, 14);
        add(lblClave);
        txtClave = new JPasswordField();
        txtClave.setBounds(139, 79, 191, 20);
        add(txtClave);

        btnIngresarEmpresa = new JButton("Ingresar como Empresa");
        btnIngresarEmpresa.setBounds(18, 117, 152, 23);
        btnIngresarEmpresa.addActionListener(e -> ingresarEmpresa());
        add(btnIngresarEmpresa);

        btnIngresarPostulante = new JButton("Ingresar como Postulante");
        btnIngresarPostulante.setBounds(178, 117, 163, 23);
        btnIngresarPostulante.addActionListener(e -> ingresarPostulante());
        add(btnIngresarPostulante);

        btnRegistrarEmpresa = new JButton("Registrar Empresa");
        btnRegistrarEmpresa.setBounds(18, 158, 143, 23);
        btnRegistrarEmpresa.addActionListener(e -> abrirRegistroEmpresa());
        add(btnRegistrarEmpresa);

        btnRegistrarPostulante = new JButton("Registrar Postulante");
        btnRegistrarPostulante.setBounds(187, 158, 154, 23);
        btnRegistrarPostulante.addActionListener(e -> abrirRegistroPostulante());
        add(btnRegistrarPostulante);
    }

    private void ingresarEmpresa() {
    }

    private void ingresarPostulante() {
    }

    private void abrirRegistroEmpresa() {
        new RegistroClienteView().setVisible(true);
    }

    private void abrirRegistroPostulante() {
        new RegistroPostulanteView().setVisible(true);
    }

}
