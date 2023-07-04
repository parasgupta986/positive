package com.intershala.javaapp;
import java.util.*;
public class Main {

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        if(num<0){
            System.out.println("negative number");
        }else if(num>1){
            System.out.println("positive number");
        }else{
            System.out.println("zero-");
        }
    }
}
