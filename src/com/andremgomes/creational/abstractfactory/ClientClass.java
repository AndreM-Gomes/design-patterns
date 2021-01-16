package com.andremgomes.creational.abstractfactory;

public class ClientClass {
    public void loginUser(){
        AbstractUserFactory abstractUserFactory = new UserFactoryByEmailPrefix();
        User userInfo = abstractUserFactory.getUserInfo("contact@apple.com");
        if(userInfo.hasAcceptedTerms && userInfo.hasAcceptedPrivacityPolicies){
            userInfo.login();
        }else{
            userInfo.acceptPrivacityPolicies();
            userInfo.acceptPrivacityPolicies();
        }
    }
}
