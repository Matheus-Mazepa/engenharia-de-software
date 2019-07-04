package br.edu.utfpr.factorycontrol.model.repository;

import br.edu.utfpr.factorycontrol.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
