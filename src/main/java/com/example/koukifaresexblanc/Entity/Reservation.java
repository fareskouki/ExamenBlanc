package com.example.koukifaresexblanc.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "reservation")
public class Reservation {
    @Id
    private String id;
    @ManyToOne(cascade = CascadeType.ALL)
    Vol vol;
    @ManyToOne(cascade = CascadeType.ALL)
    Voyageur voyageur;
    @Enumerated(EnumType.STRING)
    private EtatReservation etatReservation;
    @Enumerated(EnumType.STRING)
    private ClassPlace classPlace;

}
