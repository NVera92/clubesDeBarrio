package com.clubesdebarrio.mdp.controller;

import com.clubesdebarrio.mdp.model.Barrio;
import com.clubesdebarrio.mdp.service.IBarrioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BarrioController {

    @Autowired
    IBarrioService iBarrioService;

    // Alta
    @PostMapping("/barrio/crear")
    public String saveBarrio(@RequestBody Barrio barrio){
        String mensaje = "";
        try{
            iBarrioService.saveBarrio(barrio);
            mensaje = "El barrio fue creado con exito";
        }catch (Error e){
            mensaje = "Error al crear el barrio. Error: "+e.getMessage();
        }
        return mensaje;
    }

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
}
