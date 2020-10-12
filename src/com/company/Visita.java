package com.company;

import java.util.Date;

public class Visita {
    String codVisita;
    Date fechaHora;
    Hospital hospital;
    Servicios servicios;
    Medico medico;
    String diagnostico;
    String tratamiento;
    int numeroCama;
    Date fechaSalida;
    Historial historial;

    public Visita(String codVisita, Date fechaHora, Hospital hospital, Servicios servicios, Medico medico, String diagnostico, String tratamiento, int numeroCama, Date fechaSalida, Historial historial) {
        this.codVisita = codVisita;
        this.fechaHora = fechaHora;
        this.hospital = hospital;
        this.servicios = servicios;
        this.medico = medico;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.numeroCama = numeroCama;
        this.fechaSalida = fechaSalida;
        this.historial = historial;
    }
}
