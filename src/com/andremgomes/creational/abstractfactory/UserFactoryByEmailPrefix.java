package com.andremgomes.creational.abstractfactory;

public class UserFactoryByEmailPrefix implements AbstractUserFactory{
    public User getUserInfo(String email){
        if(email.startsWith("contact")){
            return new Contact();
        }else if(email.startsWith("admin")){
            return new Admin();
        }else if(email.startsWith("provider")){
            return new Provider();
        }else{
            throw new IllegalArgumentException("E-mail not is valid");
        }
    }
}
