package com.clubesdebarrio.mdp.repoitory;

import com.clubesdebarrio.mdp.model.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClubRepository extends JpaRepository<Club,Long> {
}
