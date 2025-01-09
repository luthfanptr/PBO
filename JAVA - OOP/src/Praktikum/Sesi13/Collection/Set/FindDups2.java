package Praktikum.Sesi13.Collection.Set;

import java.util.*;

public class FindDups2 {
    public static void main(String[] args) {
        Set<String> uniques = new HashSet<String>();
        Set<String> dups = new HashSet<String>();

        for(String a : args){
            if(!uniques.add(a)){
                dups.add(a);
            }
            //Destructive set-difference
            uniques.removeAll(dups);
        }
        System.out.println("Unique words: " + uniques);
        System.out.println("Duplicate words: " + dups);
    }
}

//Jalankan dengan :
//java FindDups2 i came i saw i left