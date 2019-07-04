package br.edu.utfpr.factorycontrol.model.service;

import br.edu.utfpr.factorycontrol.model.Order;
import br.edu.utfpr.factorycontrol.model.User;
import br.edu.utfpr.factorycontrol.model.repository.OrderRepository;
import br.edu.utfpr.factorycontrol.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order save(Order entity){
        return this.orderRepository.save(entity);
    }
}
