package com.checkedexception;

public class InvalidRegistration extends Exception{
    public InvalidRegistration(String message)
    {
        super(message);
    }
}
