package be.bt.repository;

import be.bt.domain.Demandeur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDemandeurRepository extends JpaRepository<Demandeur,String> {
}
