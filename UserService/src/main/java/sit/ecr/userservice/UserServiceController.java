package sit.ecr.userservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sit.ecr.userservice.user.*;


@RestController
class UserServiceController {

  @Autowired
  private UserService userService;


  @PostMapping("/userservice/login")
  public ResponseEntity<String> authentication(@RequestBody User user){
    return new ResponseEntity<>("Hi",HttpStatus.OK);
  }

  @PostMapping("/userservice/create")
  public ResponseEntity<User> saveNewUser(@RequestBody User theNewUser){
    User user = userService.saveUser(theNewUser);
    return new ResponseEntity<>(user,HttpStatus.OK);
  }


}