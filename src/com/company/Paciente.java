package com.company;

import java.util.Date;

public class Paciente extends Persona {
    private String numeroSeguridadSocial;
    public Paciente(String numeroSeguridadSocial,String nombre, String primerApellido, String segundoApellido, int dni, Date fechaNacimiento, String cod){
        super(nombre, primerApellido,segundoApellido,dni,fechaNacimiento,cod);
        this.setNumeroSeguridadSocial(numeroSeguridadSocial);

    }


    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }
}
