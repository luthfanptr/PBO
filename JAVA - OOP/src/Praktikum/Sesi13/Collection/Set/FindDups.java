package Praktikum.Sesi13.Collection.Set;

import java.util.*;

public class FindDups {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        for(String a : args){
            if(!s.add(a)){
                System.out.println("Duplicate detected: " + a);
            }
        }
         System.out.println(s.size() + " distinct words: " + s);   
    }
}

//Jalankan dengan :
//java FindDups i came i saw i left