package com.company;

import java.util.List;

public class Servicios {
    String idServicio;
    String nombre;
    List<Hospital> hospitales;
    int numerooCamas;
    String comentario;

    public Servicios(String idServicio, String nombre, List<Hospital> hospitales, int numerooCamas, String comentario) {
        this.idServicio = idServicio;
        this.nombre = nombre;
        this.hospitales = hospitales;
        this.numerooCamas = numerooCamas;
        this.comentario = comentario;
    }
}
