package services;

import exceptions.invalidAgeExceptions;
import models.User;

public class UserService {
    public void registeruser(User user) throws invalidAgeExceptions{
        if(user.getAge()<18){
            throw new invalidAgeExceptions("User- "+user.getUsername()+" is underaged");
        }
            System.out.println("Registered Successfully Welcome "+user.getUsername());
        

    }
}
