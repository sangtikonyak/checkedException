package com.checkedexception.com.cehckedexception;

import java.util.Scanner;

public class Demo1Impl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1");
        int num1=sc.nextInt();
        System.out.println("enter number 2");
        int num2=sc.nextInt();
        Demo1Impl demo1Impl=new Demo1Impl();
        try{
            int sum=demo1Impl.mySum(num1,num2);
        }catch(Demo1 e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    public int mySum(int number1,int number2)throws Demo1
    {
        int res;
        res=number1+number2;
        if(res<150)
        {
            Demo1 demo1=new Demo1("sum is less than 150");
            throw demo1;
        }
        return res;
    }
}
