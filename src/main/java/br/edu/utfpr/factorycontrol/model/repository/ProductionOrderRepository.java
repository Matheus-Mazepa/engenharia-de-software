package br.edu.utfpr.factorycontrol.model.repository;

import br.edu.utfpr.factorycontrol.model.Order;
import br.edu.utfpr.factorycontrol.model.ProductionOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductionOrderRepository extends JpaRepository<ProductionOrder, Integer> {
}
