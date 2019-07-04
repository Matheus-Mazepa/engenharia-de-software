package br.edu.utfpr.factorycontrol.model.repository;

import br.edu.utfpr.factorycontrol.model.Order;
import br.edu.utfpr.factorycontrol.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
