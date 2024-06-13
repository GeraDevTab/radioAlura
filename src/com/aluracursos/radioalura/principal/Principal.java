package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresetador("Gabriela Aguiar");
        miPodcast.setTitulo("Cafe.Tech");

        for (int i =0;i<100; i++){
            miCancion.meGusta();
        }
        for (int i = 0; i < 5000; i++) {
            miCancion.reproduce();
        }

        System.out.println("Reproducciones: "+miCancion.getTotalReproducciones());
        System.out.println("Total de me gusta: " + miCancion.getTotalDeMeGusta());
    }
}
