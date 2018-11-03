package edu.csumb.cst438.userdb.entities;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "User")
public class User {
    @Id
    private String id;
    private UserName username; //make sure object is not capitalized
    private UserCredit usercredit;

    private String test;


    public User (UserName username, UserCredit usercredit) {
        
        this.username=username;

        this.usercredit=usercredit;

        
    }

    public String getId () {
        return this.id;
    }



  

    public UserName getUsername (){

        return this.username;
    }



    public UserCredit getUsercredit(){

        return this.usercredit;

    }










  
 
}