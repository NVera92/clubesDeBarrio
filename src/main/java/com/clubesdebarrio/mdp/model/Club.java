package com.clubesdebarrio.mdp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter @Setter

public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long idClub;
    @Column(name = "nombre_club")
    private String nombreClub;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_fundacion")
    private LocalDate fechaFundacion;
    @Column(name = "primer_presidente")
    private String primerPresidente;
    @Column(name = "colores")
    private String colores;
    @ManyToOne(targetEntity = Barrio.class)
    private Barrio barrio;

    public Club() {
    }

    public Club(Long idClub, String nombreClub, LocalDate fechaFundacion, String primerPresidente, String colores, Barrio barrio) {
        this.idClub = idClub;
        this.nombreClub = nombreClub;
        this.fechaFundacion = fechaFundacion;
        this.primerPresidente = primerPresidente;
        this.colores = colores;
        this.barrio = barrio;
    }
}
