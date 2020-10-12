package com.company;

import java.util.Date;
import java.util.List;

public class Medico extends Persona{
    private List<Servicios> servicio;
    private Hospital hospital;

    public Medico(String nombre, String primerApellido, String segundoApellido, int dni, Date fechaNacimiento,  String cod, List<Servicios> servicio, Hospital hospital){
    super(nombre, primerApellido,segundoApellido,dni,fechaNacimiento,cod);
        this.servicio = servicio;
        this.hospital = hospital;

    }

    public <servicio> List<servicio> getServicio() {
        return (List<servicio>) servicio;
    }

    public <servicio> void setServicio(List<servicio> servicio) {
        this.servicio = (List<Servicios>) servicio;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
