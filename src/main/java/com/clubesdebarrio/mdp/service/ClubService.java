package com.clubesdebarrio.mdp.service;

import com.clubesdebarrio.mdp.model.Club;
import com.clubesdebarrio.mdp.repoitory.IClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClubService implements IClubService {

    @Autowired
    private IClubRepository iClubRepository;

    @Override
    public void saveClub(Club club) {
        try{
            iClubRepository.save(club);
        }catch (Error e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Club> getClubes() {
        List<Club> clubList = new ArrayList<>();
        try{
            clubList = iClubRepository.findAll();
        }catch (Error e){
            System.out.println(e.getMessage());
        }
        return clubList;
    }


    @Override
    public Club findClub(Long id) {
        Club club = new Club();
        try{
            club = iClubRepository.findById(id).orElse(null);
        }catch (Error e){
            System.out.println(e.getMessage());
        }
        return club;
    }

    @Override
    public List<Club> getClubsByBarrio(Long idBarrio) {
        List<Club> clubList = new ArrayList<>();
        try{
            clubList = iClubRepository.getClubsByBarrio(idBarrio);
        }catch (Error e){
            System.out.println(e.getMessage());
        }
        return clubList;
    }

    @Override
    public List<Club> getClubsByActivo() {
        List<Club> clubList = new ArrayList<>();
        try{
            clubList = iClubRepository.getClubsByActivo();
        }catch (Error e){
            System.out.println(e.getMessage());
        }
        return clubList;
    }

    @Override
    public List<Club> getClubsByInactivo() {
        List<Club> clubList = new ArrayList<>();
        try{
            clubList = iClubRepository.getClubsByInactivo();
        }catch (Error e){
            System.out.println(e.getMessage());
        }

        return clubList;
    }

    @Override
    public List<Club> getClubsByActividad(String actividad) {
        List<Club> clubList = new ArrayList<>();
        try{
            clubList = iClubRepository.getClubsByActividad(actividad);
        }catch (Error e){
            System.out.println(e.getMessage());
        }
        return  clubList;
    }


    @Override
    public void editClub(Club club) {
        try{
            this.saveClub(club);
        }catch (Error e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteClub(Long id) {
        try{
            iClubRepository.deleteById(id);
        }catch (Error e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Integer getCountClubs() {
        Integer count = 0;
        try{
            count= iClubRepository.getCountClubs();
        }catch (Error e){
            System.out.println(e.getMessage());
        }
        return count;
    }

    @Override
    public Integer getCountInactiveClubs() {
        Integer count = 0;
        try{
            count = iClubRepository.getCountInactiveClubs();
        }catch (Error e){
            System.out.println(e.getMessage());
        }
        return count;
    }

    @Override
    public Integer getCountActiveClubs() {
        Integer count = 0;
        try{
            count = iClubRepository.getCountActiveClubs();
        }catch (Error e){
            System.out.println(e.getMessage());
        }
        return count;
    }
}
