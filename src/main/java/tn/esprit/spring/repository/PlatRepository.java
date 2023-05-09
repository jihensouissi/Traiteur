package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.entities.Plat;

import java.util.List;

public interface PlatRepository extends JpaRepository<Plat, Integer> {
    public List<Plat> findByClientNomAndClientPrenom(String nom, String prenom);
}