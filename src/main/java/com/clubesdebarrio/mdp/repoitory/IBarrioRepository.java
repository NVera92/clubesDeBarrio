package com.clubesdebarrio.mdp.repoitory;

import com.clubesdebarrio.mdp.model.Barrio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IBarrioRepository extends JpaRepository<Barrio,Long> {

    @Query(value = "SELECT COUNT(*) FROM barrio", nativeQuery = true)
    public Integer getCountBarrios();
}
