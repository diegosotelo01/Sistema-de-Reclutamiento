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

    public String getEmail() { return email; }
    public String getNombres() { return nombres; }
    public String getApellidos() { return apellidos; }
    public String getDireccion() { return direccion; }
    public Date getNacimiento() { return nacimiento; }
    public void setClave(String clave) { this.clave = clave; }
    public GradoEstudio getGradoEstudio() { return gradoEstudio; }

    public boolean asignarGradoEstudio(GradoEstudio grado) {
        gradoEstudio = grado;
        return true;
    }

    public boolean postular(Oferta oferta) {
        Postulacion p = new Postulacion(new Date(), oferta, this);
        postulaciones.add(p);
        return true;
    }

    public boolean anularPostulacion(Postulacion postulacion) {
        postulacion.setAnulado(true);
        postulacion.setFechaAnulacion(new Date());
        return true;
    }

    public Postulacion[] getPostulaciones() {
        return postulaciones.toArray(new Postulacion[0]);
    }

}
