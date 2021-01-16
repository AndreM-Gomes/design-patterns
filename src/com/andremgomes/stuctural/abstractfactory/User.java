package com.andremgomes.stuctural.abstractfactory;

public abstract class User {
    public String name;
    public Boolean hasAcceptedTerms;
    public Boolean hasAcceptedPrivacityPolicies;

    abstract void acceptTerms();

    abstract void acceptPrivacityPolicies();

    abstract boolean login();
}
