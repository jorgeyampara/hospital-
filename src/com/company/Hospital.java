package com.company;

public class Hospital {
    String codHospital;
    String nombre;
    String ciudad;
    int telefono;
    Medico director;

    public Hospital(String codHospital, String nombre, String ciudad, int telefono, Medico director) {
        this.codHospital = codHospital;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.director = director;
    }
}
