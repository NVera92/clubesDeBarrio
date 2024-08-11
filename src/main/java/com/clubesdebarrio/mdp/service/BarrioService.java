package com.clubesdebarrio.mdp.service;

import com.clubesdebarrio.mdp.model.Barrio;
import com.clubesdebarrio.mdp.repoitory.IBarrioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BarrioService implements IBarrioService{

    @Autowired
    private IBarrioRepository iBarrioRepository;

    @Override
    public void saveBarrio(Barrio barrio) {
        try{
            iBarrioRepository.save(barrio);
        }catch (Error e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Barrio> getClubes() {
        List<Barrio> listaBarrios = new ArrayList<>();
        try{
            listaBarrios = iBarrioRepository.findAll();
        }catch (Error e){
            System.out.println(e.getMessage());
        }
        return listaBarrios;
    }

    @Override
    public Barrio getBarrio(Long id) {
        Barrio barrio = new Barrio();
        try{
            barrio = iBarrioRepository.findById(id).orElse(null);
        }catch (Error e){
            System.out.println(e.getMessage());
        }
        return barrio;
    }

    @Override
    public void editBarrio(Barrio barrio) {
        try{
            this.saveBarrio(barrio);
        }catch (Error e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteBarrio(Long id) {
        try{
            iBarrioRepository.deleteById(id);
        }catch (Error e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Integer getCountBarrios() {
        Integer count = 0;
        try{
            count = iBarrioRepository.getCountBarrios();
        }catch (Error e){
            System.out.println(e.getMessage());
        }
        return count;
    }
}
