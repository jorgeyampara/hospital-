package com.company;

import java.util.Date;

public class Persona {
    protected String nombre;
    protected String primerApellido;
    protected String segundoApelido;
    protected int dni;
    protected Date fechaNacimiento;
    protected String cod;

    public Persona(String nombre, String primerApellido, String segundoApelido, int dni, Date fechaNacimiento, String cod) {
        this.setNombre(nombre);
        this.setPrimerApellido(primerApellido);
        this.setSegundoApelido(segundoApelido);
        this.setDni(dni);
        this.setFechaNacimiento(fechaNacimiento);
        this.setCod(cod);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApelido() {
        return segundoApelido;
    }

    public void setSegundoApelido(String segundoApelido) {
        this.segundoApelido = segundoApelido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }


}
