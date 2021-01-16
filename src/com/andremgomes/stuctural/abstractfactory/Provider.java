package com.andremgomes.stuctural.abstractfactory;

public class Provider extends User {

    public boolean isApproved;

    @Override
    void acceptTerms() {
        this.verifyIfAlreadyAccepted();
        this.hasAcceptedTerms = true;
    }

    @Override
    void acceptPrivacityPolicies() {
        this.verifyIfAlreadyAccepted();
        this.hasAcceptedPrivacityPolicies = true;
    }

    @Override
    boolean login() {
        return this.hasAcceptedPrivacityPolicies
                && this.hasAcceptedTerms
                && this.isApproved;
    }

    private void verifyIfAlreadyAccepted(){

    }
}
