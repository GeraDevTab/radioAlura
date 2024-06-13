package com.aluracursos.radioalura.modelos;

public class Podcast extends Audio {
    private String presetador;
    private  String descripcion;

    public String getPresetador() {
        return presetador;
    }

    public void setPresetador(String presetador) {
        this.presetador = presetador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
