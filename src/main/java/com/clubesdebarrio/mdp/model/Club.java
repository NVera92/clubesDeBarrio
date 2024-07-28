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
    @Column(name = "ubicacion")
    private String ubicacion;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_fundacion")
    private LocalDate fechaFundacion;
    @Column(name = "primer_presidente")
    private String primerPresidente;
    @Column(name = "colores")
    private String colores;
    @Column(name = "activo")
    private Boolean activo;
    @Column(name = "deportes")
    private String deportes;
    @Column(name = "imagen_ubicacion")
    private String imagenUbicacion;
    @ManyToOne(targetEntity = Barrio.class)
    private Barrio barrio;

    public Club() {
    }

    public Club(Long idClub, String nombreClub, String ubicacion, LocalDate fechaFundacion, String primerPresidente, String colores, Boolean activo, String deportes, String imagenUbicacion, Barrio barrio) {
        this.idClub = idClub;
        this.nombreClub = nombreClub;
        this.ubicacion = ubicacion;
        this.fechaFundacion = fechaFundacion;
        this.primerPresidente = primerPresidente;
        this.colores = colores;
        this.activo = activo;
        this.deportes = deportes;
        this.imagenUbicacion = imagenUbicacion;
        this.barrio = barrio;
    }
}
