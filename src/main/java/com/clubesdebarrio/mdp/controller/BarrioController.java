package com.clubesdebarrio.mdp.controller;

import com.clubesdebarrio.mdp.model.Barrio;
import com.clubesdebarrio.mdp.service.IBarrioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BarrioController {

    @Autowired
    IBarrioService iBarrioService;


    // Listar todos los barrios
    @GetMapping("/barrio/traer")
    public List<Barrio> getBarrios(){
        List<Barrio> listaBarrios = new ArrayList<>();
        try{
            listaBarrios = iBarrioService.getClubes();
        }catch (Error e){
            System.out.println("Error : "+e.getMessage());
        }
        return listaBarrios;
    }

    // Listar barrio por ID
    @GetMapping("/barrio/traer/{id}")
    public Barrio getBarrio(@PathVariable Long id){
        return iBarrioService.getBarrio(id);
    }
}
