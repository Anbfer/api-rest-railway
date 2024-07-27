package dio.apirestful.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import dio.apirestful.domain.model.User;
import dio.apirestful.repository.UserRepository;
import dio.apirestful.service.UserService;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User addUser(User userToAdd) {
        if (userRepository.existsByAccountNumber(userToAdd.getAccount().getNumber())) 
            throw new IllegalArgumentException("This user Account number already exists");

        return userRepository.save(userToAdd);
    }

}
