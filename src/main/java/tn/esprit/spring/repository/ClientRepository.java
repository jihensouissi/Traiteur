package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}