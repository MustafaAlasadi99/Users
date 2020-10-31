package edu.csumb.cst438.userdb;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.HttpStatus;


import edu.csumb.cst438.userdb.entities.User;

@RestController
public class UserController {
    @Autowired
    IUserRepository userRepo;

    
    @CrossOrigin(origins = "https://user-service1.herokuapp.com"  )
    @GetMapping("/username/{UserName}")
    public User getInfoByUsername (@PathVariable String UserName) {
     
        
        User result = userRepo.findByUserName(UserName);
        return result;
    }


    @RequestMapping(value = "/persistPerson", method = RequestMethod.POST)
    public ResponseEntity<String> persistPerson(@RequestBody User user) {
      if (User.isValid(user)) {
        userRepo.persist(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
      }
      return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
    }


    @GetMapping ("/allUsers")
    public List<User> getAll () {
        List<User> result = userRepo.findAll();
        return result;
    }



    @GetMapping("/test")
    public String test () {
       return "test test test";
    }
	
}