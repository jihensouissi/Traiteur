package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.spring.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {
    @Query("Select c From Client c where c.nom= :nom and c.prenom= :prenom")
    public Client findByNomEAndPrenomE(@Param("nom") String nom, @Param("prenom") String prenom);

}