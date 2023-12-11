package com.example.koukifaresexblanc.Repository;

import com.example.koukifaresexblanc.Entity.Aeroport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAeroport extends JpaRepository<Aeroport,Integer> {
}
