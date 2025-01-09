package Praktikum.Sesi13.Collection.Set;

import java.util.*;

//Implementasi interface Set yaitu class HashSet dan class TreeSet 
public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Bernadine");
        set.add("Elizabeth");
        set.add("Gene");
        set.add("Elizabeth");
        set.add("Clara");
        System.out.println("Elemen pada HashSet : ");
        System.out.println(set);
        Set<String> sortSet = new TreeSet<>(set);
        System.out.println("Elemen pada TreeSet : ");
        System.out.println(sortSet);

    }
}