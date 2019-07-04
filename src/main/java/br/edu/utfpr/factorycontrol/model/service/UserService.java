package br.edu.utfpr.factorycontrol.model.service;

import br.edu.utfpr.factorycontrol.model.User;
import br.edu.utfpr.factorycontrol.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User entity){
        return this.userRepository.save(entity);
    }
}
