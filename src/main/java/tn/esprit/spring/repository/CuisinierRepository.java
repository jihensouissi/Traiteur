package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.entities.Cuisinier;

public interface CuisinierRepository extends JpaRepository<Cuisinier, Integer> {
}