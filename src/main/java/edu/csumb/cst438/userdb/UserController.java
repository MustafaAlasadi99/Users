package edu.csumb.cst438.userdb;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PostMapping;

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

    /*
    @RequestMapping(value = "/persistPerson", method = RequestMethod.POST)
    public ResponseEntity<String> persistPerson(@RequestBody User user) {
      
        userRepo.persist(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
     
    }

    */


    @PostMapping("/New-user")
    User newUser(@RequestBody User newUser) {

        if(newUser!=userRepo.findByUserName(newUser.username.name))
     
      return userRepo.save(newUser);


      else return newUser;
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