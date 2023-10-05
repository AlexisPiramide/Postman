package com.example.Postman.Infraestructura.Data;


import com.example.Postman.Dominio.Oferta;
import com.example.Postman.Dominio.OfertaRepository;

import java.util.ArrayList;
import java.util.List;

public class ActividadRepositoryRAM implements OfertaRepository {

    public List<Oferta> oferta = new ArrayList<>();

    public ActividadRepositoryRAM() {
        Oferta backcend   = new Oferta("Desarrollador Back End", "Esta descripcion describe cosas descriptivas sobre la descripcion de un objeto que necesita descripcion");
        Oferta frontend = new Oferta("Desarrollador Front End", "Esta descripcion describe cosas descriptivas sobre la descripcion de un objeto que necesita descripcion");
        Oferta fullstack = new Oferta("Desarrollador Full Stack", "Esta descripcion describe cosas descriptivas sobre la descripcion de un objeto que necesita descripcion");

        oferta.add(backcend);
        oferta.add(frontend);
        oferta.add(fullstack);
    }

    @Override
    public List<Oferta> getAll() {
        return this.oferta;
    }

    @Override
    public List<Oferta> getTitulos(Oferta titulo) {
        return null;
    }

    @Override
    public List<Oferta> getMatricula(Coche matricula) {
        return null;
    }

}