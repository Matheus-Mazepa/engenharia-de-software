package br.edu.utfpr.factorycontrol.model.service;

import br.edu.utfpr.factorycontrol.model.Client;
import br.edu.utfpr.factorycontrol.model.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client save(Client entity){
        return this.clientRepository.save(entity);
    }
}
