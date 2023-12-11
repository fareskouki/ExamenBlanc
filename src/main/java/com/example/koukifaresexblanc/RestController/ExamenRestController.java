package com.example.koukifaresexblanc.RestController;

import com.example.koukifaresexblanc.Entity.*;
import com.example.koukifaresexblanc.Service.ExamenService;
import com.example.koukifaresexblanc.Service.IExamenService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/examen")
@RequiredArgsConstructor
public class ExamenRestController {

    ExamenService examenService;
    IExamenService iExamenService;
    private final ExamenService examenService;


    @PostMapping("/ajouter")
    public String ajouterVolEtAeroport(@RequestBody Vol vol) {
        return examenService.ajouterVolEtAeroport(Vol vol);
    }
    @PostMapping("/ajouterVoyageur")
    List<Voyageur> ajouterVoyageurs(@RequestBody List<Voyageur> voyageurs){
        return examenService.ajouterVolEtAeroport(voyageurs);
    }

}


