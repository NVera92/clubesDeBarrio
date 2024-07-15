package com.clubesdebarrio.mdp.service;

import com.clubesdebarrio.mdp.model.Barrio;
import com.clubesdebarrio.mdp.model.Club;

import java.util.List;

public interface IBarrioService {

    // Alta
    public void saveBarrio(Barrio barrio);

    // Traer todos los barrios
    public List<Barrio> getClubes();

    // Traer club por id
    public Barrio getBarrio(Long id);

    // Modificacion
    public void editBarrio(Barrio barrio);

    // Baja
    public void deleteBarrio(Long id);
}
