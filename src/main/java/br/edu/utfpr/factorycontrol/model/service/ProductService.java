package br.edu.utfpr.factorycontrol.model.service;

import br.edu.utfpr.factorycontrol.model.Client;
import br.edu.utfpr.factorycontrol.model.Product;
import br.edu.utfpr.factorycontrol.model.repository.ClientRepository;
import br.edu.utfpr.factorycontrol.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product save(Product entity){
        return this.productRepository.save(entity);
    }
}
