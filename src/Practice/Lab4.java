/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import common.Dog;
import java.util.*;

/**
 *
 * @author jerem
 */
public class Lab4 {

    /*
    Lab #4 – Create 4 dog objects, making sure you have at least one duplicate
    (based on your rules for equality).
    Put those in Set and remove duplicates
     */
    public static void main(String[] args) {

        Dog dog = new Dog("fido", 12345);
        Dog dog1 = new Dog("max", 12346);
        Dog dog2 = new Dog("diesel", 12347);
        Dog dog3 = new Dog("fido", 12345);

        Set<Dog> list = new HashSet<>();
        list.add(dog);
        list.add(dog1);
        list.add(dog2);
        list.add(dog3);
        list.add(dog);
        
        for(Dog d : list){
        
            System.out.println(d.toString());
            System.out.println("");
        
        }
        
        
    }
}
