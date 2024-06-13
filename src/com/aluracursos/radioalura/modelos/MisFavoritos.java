package com.aluracursos.radioalura.modelos;

public class MisFavoritos {
    public void adicione(Audio audio){
        if (audio.getClasificacion()>=8){
            System.out.println(audio.getTitulo()+" Es uno de losw favoritos del momento");
        }
        else{
            System.out.println(audio.getTitulo()+" tambien es un o de los favoritos");
        }
    }
}
