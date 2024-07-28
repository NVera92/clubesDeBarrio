package com.clubesdebarrio.mdp.service;

import com.clubesdebarrio.mdp.model.Barrio;
import com.clubesdebarrio.mdp.model.Club;

import java.util.List;

public interface IClubService {

    // Alta
    public void saveClub(Club club);

    // Traer todos los clubes
    public List<Club> getClubes();

    // Traer club por id
    public Club findClub(Long id);

    // Traer clubes por barrio
    public List<Club> getClubsByBarrio(Long idBarrio);

    // Traer los clubes que estan activos
    public List<Club> getClubsByActivo();

    // Traer los clubes que estan inactivos
    public List<Club> getClubsByInactivo();

    // Traer clubes por actividad
    public List<Club> getClubsByActividad(String actividad);

    // Modificacion
    public void editClub(Club club);

    // Baja
    public void deleteClub(Long id);

}
