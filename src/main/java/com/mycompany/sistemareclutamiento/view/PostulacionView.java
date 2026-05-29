package com.mycompany.sistemareclutamiento.view;

import javax.swing.*;

public class PostulacionView extends JFrame {

    private JLabel lblEmail, lblOfertas;
    private JTextField txtEmail;
    private JComboBox<String> cmbOfertas;
    private JButton btnPostular;
    private JTextArea txtResultado;

    public PostulacionView() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Sistema de Reclutamiento - Postulación");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

}
