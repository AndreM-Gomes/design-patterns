package com.andremgomes.creational.builder;

public class ConnectionBuilder {
    private ConnectionInfo connection;

    public ConnectionBuilder(){
        this.connection = new ConnectionInfo();
    }

    private ConnectionBuilder setUrl(String url){
        this.connection.setUrl(url);
        return this;
    }

    private ConnectionBuilder setUsername(String username){
        this.connection.setUsername(username);
        return this;
    }

    private ConnectionBuilder setPassword(String password){
        this.connection.setPassword(password);
        return this;
    }

    private ConnectionBuilder setSchema(String schemaName){
        this.connection.setSchema(schemaName);
        return this;
    }

    private ConnectionInfo build(){
        return this.connection;
    }

}
