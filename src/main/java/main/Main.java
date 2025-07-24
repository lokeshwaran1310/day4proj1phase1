package main;

import exceptions.invalidAgeExceptions;
import models.User;
import services.UserService;

public class Main {
    public static void main(String[] args) {
        UserService obj=new UserService();
    User obj1=new User("lokesh",21);
    User obj2=new User("sounder", 17);
    User obj3=new User("adrin",20);    
    User [] arr={obj1,obj2,obj3}; 
            for(User user:arr){
                try{
                obj.registeruser(user);
                }
                catch(invalidAgeExceptions e){
                    System.out.println("Registration failed: "+e.getMessage());
                }
            }
}
}
