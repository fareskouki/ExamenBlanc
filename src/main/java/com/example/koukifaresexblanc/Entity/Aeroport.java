package com.example.koukifaresexblanc.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "aeroport")
public class Aeroport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAeroport;
    @Column(name="nom",nullable = false)
    private String nom;
    @Column(name="codeAITA")
    private String codeAITA;
    @Column(name="telephone")
    private String telephone;
    @OneToMany(mappedBy="aeroportA")
    private Set<Vol> vols;
    @OneToMany(mappedBy="aeroport")
    private Set<Vol> vol;
}
