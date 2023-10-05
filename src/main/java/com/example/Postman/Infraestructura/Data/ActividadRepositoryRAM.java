package com.example.Postman.Infraestructura.Data;

import com.example.Actividad2Sergio.Dominio.Coche;
import com.example.Actividad2Sergio.Dominio.CocheRepository;

import java.util.ArrayList;
import java.util.List;

public class ActividadRepositoryRAM implements CocheRepository {

    public List<Coche> coches = new ArrayList<>();

    public ActividadRepositoryRAM() {
        Coche ferrari = new Coche("15F1JG1", "Ferrari", "Uno caro", 5990);
        Coche dacia = new Coche("H2KH164", "Dacia", "Sandero", 999999);
        Coche abutarda = new Coche("420BLAZE", "Tesla", "Catorce", 42069);

        coches.add(ferrari);
        coches.add(dacia);
        coches.add(abutarda);
    }

    @Override
    public List<Coche> getAll() {
        return this.coches;
    }

    @Override
    public List<Coche> getMatricula(Coche matricula) {
        return null;
    }

}