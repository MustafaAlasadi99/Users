package edu.csumb.cst438.userdb;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.csumb.cst438.userdb.entities.UserCredit;
import edu.csumb.cst438.userdb.entities.UserName;
import edu.csumb.cst438.userdb.entities.User;

@Component
public class UserDbSeeder implements CommandLineRunner{
    @Autowired
    IUserRepository userRepo;

    @Override
    public void run(String... args) throws Exception {
        
       
        User admin = new User(new UserName("admin"), new UserCredit(10000));
        User admin2 = new User(new UserName("admin2"), new UserCredit(10000));
        

        //delete db data
        userRepo.deleteAll();
        //add db seeds
        List<User> users = Arrays.asList(admin,admin2);
        userRepo.saveAll(users);

        
        
        
        
        
      
    }

}