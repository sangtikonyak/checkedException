package com.checkedexception;

public class Impl {
    public static void main(String[] args) {
        Registration registration=new Registration();
        try {
           boolean res= registration.userRegistration("sangti", 12);
           if(res)
           {
               System.out.println("successfully register");
           }
           else {
               System.out.println("under age registration failed");
           }
        }catch(InvalidRegistration e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
