package com.example.Postman.Applicacion;


import com.example.Postman.Dominio.Oferta;
import com.example.Postman.Dominio.OfertaRepository;
import com.example.Postman.Infraestructura.Data.ActividadRepositoryRAM;

import java.util.ArrayList;
import java.util.List;

public class UseCases {

    private OfertaRepository ofertaRepository;

    public UseCases(ActividadRepositoryRAM actividadRepositoryRAM) {
        this.ofertaRepository = new ActividadRepositoryRAM();
    }

    public List<Oferta> getAll(){
        return this.ofertaRepository.getAll();
    }

    public List<Oferta> getTitulo(Oferta oferta){
        List<Oferta> result = new ArrayList<>();
        result.add(oferta);
        return result;
    }

}

