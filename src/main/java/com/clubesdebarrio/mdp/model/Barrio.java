package com.clubesdebarrio.mdp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
public class Barrio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_barrio")
    private Long idBarrio;
    @Column(name = "nombre_barrio")
    private String nombreBarrio;
    @OneToMany(targetEntity = Club.class, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Club> clubesBarrio;

    public Barrio() {
    }

    public Barrio(Long idBarrio, String nombreBarrio) {
        this.idBarrio = idBarrio;
        this.nombreBarrio = nombreBarrio;
    }
}
