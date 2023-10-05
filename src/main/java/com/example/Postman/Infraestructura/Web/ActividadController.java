package com.example.Postman.Infraestructura.Web;

import com.example.Actividad2Sergio.Applicacion.ActividadUseCases;
import com.example.Actividad2Sergio.Dominio.Coche;
import com.example.Actividad2Sergio.Infraestructura.Data.ActividadRepositoryRAM;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ActividadController{

    ActividadUseCases actividadUseCases;
    List<Coche> coches;

    public ActividadController(){
        this.actividadUseCases = new ActividadUseCases(new ActividadRepositoryRAM());
        coches = actividadUseCases.getAll();
    }

    @GetMapping("/")
    String index(Model model){

        model.addAttribute("coches",coches);
        return "index";
    }

    @PostMapping("/nuevo")
    public String añadirCoche(Model model,Coche coche) {
        coches.add(coche);
        model.addAttribute("coches",coches);
        return "index";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevoCoche() {
        return "nuevo";
    }

    @PostMapping("/buscar")
    public String buscar(@RequestParam String matricula, Model model) {
        List<Coche> cochesEncontrados = new ArrayList<>();

        for (Coche coche : coches) {
            if (coche.getMatricula().equals(matricula)) {
                cochesEncontrados.add(coche);
            }
        }

        model.addAttribute("cochesEncontrados", cochesEncontrados);
        return "buscar";
    }
}

