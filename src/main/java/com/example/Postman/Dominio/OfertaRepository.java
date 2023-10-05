package com.example.Postman.Dominio;

import java.util.List;

public interface OfertaRepository {

    public List<Oferta> getAll();
    public List<Oferta> getTitulos(Oferta titulo);
}
