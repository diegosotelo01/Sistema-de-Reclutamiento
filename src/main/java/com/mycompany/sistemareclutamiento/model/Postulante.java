package com.mycompany.sistemareclutamiento.model;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Postulante {

    private String email;
    private String nombres;
    private String apellidos;
    private String direccion;
    private Date nacimiento;
    private String clave;
    private GradoEstudio gradoEstudio;
    private List<Postulacion> postulaciones;

    public Postulante(String email, String nombres, String apellidos, String direccion, Date nacimiento) {
        this.email = email;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.nacimiento = nacimiento;
        this.postulaciones = new ArrayList<>();
    }

    public boolean asignarGradoEstudio(GradoEstudio grado) { return false; }
    public boolean postular(Oferta oferta) { return false; }
    public boolean anularPostulacion(Postulacion postulacion) { return false; }
    public Postulacion[] getPostulaciones() { return null; }

}
