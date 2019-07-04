package br.edu.utfpr.factorycontrol.model.service;

import br.edu.utfpr.factorycontrol.model.Order;
import br.edu.utfpr.factorycontrol.model.ProductionOrder;
import br.edu.utfpr.factorycontrol.model.repository.OrderRepository;
import br.edu.utfpr.factorycontrol.model.repository.ProductionOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductionOrderService {

    @Autowired
    private ProductionOrderRepository productionOrderRepository;

    public ProductionOrder save(ProductionOrder entity){
        return this.productionOrderRepository.save(entity);
    }
}
