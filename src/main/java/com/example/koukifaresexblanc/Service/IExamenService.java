package com.example.koukifaresexblanc.Service;

import com.example.koukifaresexblanc.Entity.Aeroport;
import com.example.koukifaresexblanc.Entity.ClassPlace;
import com.example.koukifaresexblanc.Entity.Vol;
import com.example.koukifaresexblanc.Entity.Voyageur;

import java.util.List;

public interface IExamenService {
    String ajouterVolEtAeroport(Vol vol);
    List<Voyageur> ajouterVoyageurs(List<Voyageur> voyageurs);
    String reserverVol(int voyageurId, int volId, ClassPlace classPlace);

}

