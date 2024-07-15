package com.clubesdebarrio.mdp.service;

import com.clubesdebarrio.mdp.model.Club;

import java.util.List;

public interface IClubService {

    // Alta
    public void saveClub(Club club);

    // Traer todos los clubes
    public List<Club> getClubes();

    // Traer club por id
    public Club findClub(Long id);

    // Modificacion
    public void editClub(Club club);

    // Baja
    public void deleteClub(Long id);
}
