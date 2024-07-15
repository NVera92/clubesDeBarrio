package com.clubesdebarrio.mdp.controller;

import com.clubesdebarrio.mdp.model.Club;
import com.clubesdebarrio.mdp.service.IClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClubController {

    @Autowired
    private IClubService iClubService;

    // Alta
    @PostMapping("/club/crear")
    public String saveClub(@RequestBody Club club){
        String mensaje = "";
        try{
            iClubService.saveClub(club);
            mensaje = "El club fue creado con exito";
        }catch (Error e){
            mensaje="Error al crear el club. Error: "+e.getMessage();
        }
        return mensaje;
    }

    // Traer
    @GetMapping("/club/traer")
    public List<Club> getClubes(){
        List<Club> listaClubes = new ArrayList<>();
        try{
            listaClubes = iClubService.getClubes();
        }catch (Error e){
            System.out.println(e.getMessage());
        }
        return listaClubes;
    }

}
