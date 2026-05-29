package com.mycompany.sistemareclutamiento.view;

import javax.swing.*;

public class RegistroClienteView extends JFrame {

    private JLabel lblRuc, lblRazonSocial, lblEmail, lblContacto, lblTelefono, lblRubro;
    private JTextField txtRuc, txtRazonSocial, txtEmail, txtContacto, txtTelefono;
    private JComboBox<String> cmbRubro;
    private JButton btnRegistrar;
    private JTextArea txtResultado;

    public RegistroClienteView() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Sistema de Reclutamiento - Registro de Empresa");
        setSize(450, 480);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        lblRuc = new JLabel("RUC:");
        lblRuc.setBounds(14, 52, 31, 14);
        add(lblRuc);
        txtRuc = new JTextField();
        txtRuc.setBounds(143, 49, 267, 20);
        add(txtRuc);

        lblRazonSocial = new JLabel("Razón Social:");
        lblRazonSocial.setBounds(14, 87, 83, 14);
        add(lblRazonSocial);
        txtRazonSocial = new JTextField();
        txtRazonSocial.setBounds(143, 84, 267, 20);
        add(txtRazonSocial);

        lblEmail = new JLabel("Email:");
        lblEmail.setBounds(14, 122, 32, 14);
        add(lblEmail);
        txtEmail = new JTextField();
        txtEmail.setBounds(143, 119, 267, 20);
        add(txtEmail);

        lblContacto = new JLabel("Contacto:");
        lblContacto.setBounds(14, 157, 54, 14);
        add(lblContacto);
        txtContacto = new JTextField();
        txtContacto.setBounds(143, 154, 267, 20);
        add(txtContacto);

        lblTelefono = new JLabel("Teléfono:");
        lblTelefono.setBounds(14, 192, 51, 14);
        add(lblTelefono);
        txtTelefono = new JTextField();
        txtTelefono.setBounds(143, 189, 267, 20);
        add(txtTelefono);

        lblRubro = new JLabel("Rubro:");
        lblRubro.setBounds(14, 227, 37, 14);
        add(lblRubro);
        cmbRubro = new JComboBox<>(new String[]{"Tecnología", "Finanzas", "Salud", "Educación", "Retail"});
        cmbRubro.setBounds(143, 224, 267, 20);
        add(cmbRubro);

        btnRegistrar = new JButton("REGISTRAR");
        btnRegistrar.setBounds(157, 261, 89, 23);
        add(btnRegistrar);

        txtResultado = new JTextArea();
        txtResultado.setEditable(false);
        JScrollPane scroll = new JScrollPane(txtResultado);
        scroll.setBounds(14, 300, 396, 162);
        add(scroll);
    }

    public String getTxtRuc() { return txtRuc.getText(); }
    public String getTxtRazonSocial() { return txtRazonSocial.getText(); }
    public String getTxtEmail() { return txtEmail.getText(); }
    public String getTxtContacto() { return txtContacto.getText(); }
    public String getTxtTelefono() { return txtTelefono.getText(); }
    public String getRubroSeleccionado() { return (String) cmbRubro.getSelectedItem(); }
    public JButton getBtnRegistrar() { return btnRegistrar; }
    public void mostrarResultado(String texto) { txtResultado.setText(texto); }

}
