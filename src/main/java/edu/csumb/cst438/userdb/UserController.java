package edu.csumb.cst438.userdb;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import edu.csumb.cst438.userdb.entities.User;

@RestController
public class UserController {
    @Autowired
    IUserRepository userRepo;

    
    	
    @GetMapping("/username/{UserName}")
    public User getInfoByUsername (@PathVariable String UserName) {
     
        
        User result = userRepo.findByUserName(UserName);
        return result;
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