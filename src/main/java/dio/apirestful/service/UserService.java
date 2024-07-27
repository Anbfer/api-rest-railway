package dio.apirestful.service;

import dio.apirestful.domain.model.User;

public interface UserService {
    
    User findById(Long id);

    User addUser(User userToAdd);
}
