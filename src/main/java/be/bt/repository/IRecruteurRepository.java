package be.bt.repository;

import be.bt.domain.Recruteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRecruteurRepository extends JpaRepository<Recruteur,String> {
}
