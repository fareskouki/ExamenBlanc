package com.example.koukifaresexblanc.Service;

import com.example.koukifaresexblanc.Entity.Aeroport;
import com.example.koukifaresexblanc.Entity.ClassPlace;
import com.example.koukifaresexblanc.Entity.Vol;
import com.example.koukifaresexblanc.Entity.Voyageur;
import com.example.koukifaresexblanc.Repository.RepositoryAeroport;
import com.example.koukifaresexblanc.Repository.RepositoryVol;
import com.example.koukifaresexblanc.Repository.RepositoryVoyageur;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamenService implements IExamenService{
    private RepositoryAeroport repositoryAeroport;
    private RepositoryVol repositoryVol;
    private RepositoryVoyageur repositoryVoyageur;

    @Override
    public String ajouterVolEtAeroport(Vol vol, Aeroport aeroportDepart, Aeroport aeroportArrive) {
        repositoryAeroport.save(aeroportDepart);
        repositoryAeroport.save(aeroportArrive);

        vol.setAeroport(aeroportDepart);
        vol.setAeroportA(aeroportArrive);
        repositoryVol.save(vol);
        return "ajouter";
    }

    @Override
    public String ajouterVolEtAeroport(Vol vol) {
        return null;
    }

    @Override
    public List<Voyageur> ajouterVoyageurs(List<Voyageur> voyageurs) {
        return RepositoryVoyageur.saveAll(voyageurs);
    }

    @Override
    public String reserverVol(int voyageurId, int volId, ClassPlace classPlace) {
        return null;
    }


}