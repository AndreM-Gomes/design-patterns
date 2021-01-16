package com.andremgomes.creational.abstractfactory;

public class Admin extends User{

    @Override
    void acceptTerms() {
        this.hasAcceptedTerms = true;
    }

    @Override
    void acceptPrivacityPolicies() {
        this.hasAcceptedPrivacityPolicies = true;
    }

    @Override
    boolean login() {
        return this.hasAcceptedPrivacityPolicies && this.hasAcceptedTerms;
    }
}
