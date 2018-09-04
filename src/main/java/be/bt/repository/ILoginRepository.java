package be.bt.repository;

import be.bt.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILoginRepository extends JpaRepository<User,String> {
}
