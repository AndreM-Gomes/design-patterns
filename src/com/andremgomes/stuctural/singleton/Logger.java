package com.andremgomes.stuctural.singleton;

public class Logger {
    private Logger(){}
    private static Logger instance;

    public static Logger getInstance() {
        if(Logger.instance == null){
            Logger.instance = new Logger();
        }
        return instance;
    }

    public void log(String message){
        System.out.println(message);
    }
}
