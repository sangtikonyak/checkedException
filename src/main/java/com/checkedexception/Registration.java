package com.checkedexception;

public class Registration {
    public boolean userRegistration(String name,int age) throws InvalidRegistration
    {
        boolean res = true;
        if(age<13)
        {
            //generated exception
            InvalidRegistration invalidRegistration=new InvalidRegistration("user is underage");

            throw invalidRegistration;

        }

        return res;
    }
}
