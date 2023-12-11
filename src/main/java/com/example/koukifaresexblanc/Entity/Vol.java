package com.example.koukifaresexblanc.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "vol")
public class Vol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idVol;

    @Temporal(TemporalType.DATE)
    private LocalDate dateDepart;
    @Temporal(TemporalType.DATE)
    private LocalDate dateArrive;
    @ManyToOne
    @JoinColumn(name = "idAeroport")
    private Aeroport aeroport;

    @ManyToOne(cascade = CascadeType.ALL)
    Aeroport aeroportA;

    @OneToMany(mappedBy="vol")
    private Set<Reservation> reservations;
}
