package com.clubesdebarrio.mdp.repoitory;

import com.clubesdebarrio.mdp.model.Barrio;
import com.clubesdebarrio.mdp.model.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IClubRepository extends JpaRepository<Club,Long> {

    @Query(value = "SELECT * FROM club c INNER JOIN barrio b ON c.barrio_id_barrio = b.id_barrio WHERE b.id_barrio = :idBarrio",nativeQuery = true)
    public List<Club> getClubsByBarrio(@Param("idBarrio")Long idBarrio);

    @Query(value = "SELECT * FROM club c WHERE c.activo = 1",nativeQuery = true)
    public List<Club> getClubsByActivo();

    @Query(value = "SELECT * FROM club c WHERE c.activo = 0",nativeQuery = true)
    public List<Club> getClubsByInactivo();

    public final static  String  queryActividad = "SELECT * FROM club c WHERE c.deportes LIKE '%:actividad%'";
    @Modifying @Query(value = queryActividad ,nativeQuery = true)
    public List<Club> getClubsByActividad(@Param("actividad") String actividad);

    public List<Club> findByDeportes(String deportes);
}
