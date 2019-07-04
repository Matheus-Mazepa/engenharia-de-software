package br.edu.utfpr.factorycontrol.model.repository;

import br.edu.utfpr.factorycontrol.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
