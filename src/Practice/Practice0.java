/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.*;

/**
 *
 * @author jerem
 */
public class Practice0 {
    
    public static void main(String[] args) {
        //Lists can only contain objects

        //Wrong way
        ArrayList list = new ArrayList();
        list.add("hello");
        
        list.add(1);//Technicallyy this shouldnt be able to be added. verion 1.8 allows this however
        //with the use of "boxing"

        //How it used to be done
        //list.add(new Integer(1));
        //
        //
        //Its boxed by itself
        list.add(1);

        //need to cast it to an integer in order to get the primitive back
        Integer value = /*Casted -->*/ (Integer) list.get(1);
        //or
        int value1 = (int) list.get(1);
        //or whatever is allowed for that data type

        //Old ways of wrapping primitives into an object form
        int x = 1;
        Integer x1 = new Integer(1);// put it in
        int primitive = x1.intValue(); //take it out

        //Old Wrappers
        //int is Integer
        //long is Long
        //double is Double
        //
        //
        //The array list doesnt know what you want returned. 
        //when you want it you need to cast it the way you want it.
        /* <<<<<<<Instead lets setit with one data type >>>>>>>>>>>>>>>>>>>>> */
        ArrayList<String> list1 = new ArrayList<>();

        //Back to how to use list appropriately
        //Liskov 
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new Vector<>();
        List<String> list4 = new Stack<>();

        //Scenario
        //Shopping list
        list2.add("beer");
        list2.add("Chips");
        list2.add("Vodka");
        list2.add("beer");
        //add an element in the middle of the list
        list2.add(2, "Steak");
        
        //replace a list item with something else
        list2.set(3, "Bourbon");
        
        System.out.println(list2.get(0));

        //A list allows duplicates a SET does not
        for (String i : list2) {
            
            System.out.println(i);
        }
        System.out.println("");
        System.out.println("");
        
        for (int i = 0; i < list2.size(); i++) {
            
            System.out.println(list2.get(i));
        }
        
    }
    
}
