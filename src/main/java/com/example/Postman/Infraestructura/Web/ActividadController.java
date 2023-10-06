package com.example.Postman.Infraestructura.Web;

import com.example.Postman.Applicacion.UseCases;
import com.example.Postman.Dominio.Oferta;
import com.example.Postman.Infraestructura.Data.ActividadRepositoryRAM;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ActividadController{

    UseCases useCases;
    List<Oferta> ofertas;

    public ActividadController(){
        this.useCases = new UseCases(new ActividadRepositoryRAM());
        ofertas = useCases.getAll();
    }

    @GetMapping("/")
    String index(Model model){

        model.addAttribute("ofertas",ofertas);
        return "index";
    }

    @PostMapping("/nuevo")
    public String añadirOferta(Model model,Oferta oferta) {
        ofertas.add(oferta);
        model.addAttribute("ofertas",ofertas);
        return "index";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevaOferta() {
        return "nuevo";
    }

    @PostMapping("/buscar")
    public String buscar(@RequestParam String titulo, Model model) {
        List<Oferta> ofertasEncontrados = new ArrayList<>();

        for (Oferta oferta : ofertas) {
            if (oferta.getTitulo().equals(titulo)) {
                ofertasEncontrados.add(oferta);
            }
        }

        model.addAttribute("ofertasEncontrados", ofertasEncontrados);
        return "buscar";
    }
}

