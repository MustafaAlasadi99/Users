package edu.csumb.cst438.userdb;

import java.util.List;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import edu.csumb.cst438.userdb.entities.User;

@Repository
public interface IUserRepository extends MongoRepository<User, String> {
    @Query (value = "{'username.name':?0}")   
    User findByUserName(String username);

    

}