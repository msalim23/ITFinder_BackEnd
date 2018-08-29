package be.bt.repository;

import be.bt.domain.Offre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOffreRepository extends JpaRepository<Offre,String> {
}
