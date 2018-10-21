package sit.ecr.userservice.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findById(long id) {
      User user = userRepository.getOne(id);
      return user;
    }

    public User saveUser(User user){
      return userRepository.save(user);
    }
}