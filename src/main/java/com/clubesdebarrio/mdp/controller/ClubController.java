package com.clubesdebarrio.mdp.controller;

import com.clubesdebarrio.mdp.model.Club;
import com.clubesdebarrio.mdp.service.IClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClubController {

    @Autowired
    private IClubService iClubService;


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

    // Traer club por id
    @GetMapping("/club/traer/{id}")
    public Club getClub(@PathVariable long id){
        return iClubService.findClub(id);
    }

    // Traer clubes por barrio
    @GetMapping("club/traerPorBarrio/{idBarrio}")
    public List<Club> getClubsPorBarrio(@PathVariable Long idBarrio){
        return iClubService.getClubsByBarrio(idBarrio);
    }

    // Traer todos los clubes activos
    @GetMapping("club/traerActivos")
    public List<Club> getClubsByActivo(){
        return iClubService.getClubsByActivo();
    }

    // Traer todos los clubes inactivos
    @GetMapping("club/traerInactivos")
    public List<Club> getClubsByInactivo(){
        return iClubService.getClubsByInactivo();
    }

    // Traer clubes por actividad deportiva
    @GetMapping("club/deportes/{actividad}")
    public List<Club> getClubsByActividad(@PathVariable String actividad){
        return iClubService.getClubsByActividad(actividad);
    }

    // Traer conteo de todos los clubes de la DDBB
    @GetMapping("club/totalClubes")
    public Integer getCountClubs(){
        return iClubService.getCountClubs();
    }

    // Traer conteo de clubes inactivos
    @GetMapping("club/totalClubesInactivos")
    public Integer getCountInactiveClubs(){
        return iClubService.getCountInactiveClubs();
    }

    // Traer conteo de clubes activos
    @GetMapping("club/totalClubesActivos")
    public Integer getCountActiveClubs(){
        return iClubService.getCountActiveClubs();
    }

}
