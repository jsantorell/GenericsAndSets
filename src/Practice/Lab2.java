/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import common.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jerem
 */
public class Lab2 {
    
    /*
    Lab #2 – Create a List of Employee objects without using Generics.
    Now loop through the list and, within the loop,
    retrieve employee objects one by one by using a local Employee variable inside the loop.
    After setting the variable to the value of the object retrieved, output that variable to the console.
    Did you remember to cast the employee object?
    Did you get the output from toString()?
    Show your instructor your results.
    */
    public static void main(String[] args) {
        
    
    Employee e0 = new Employee("Doe", "John", "333333333");
    Employee e1 = new Employee("Dane", "Jane", "444444444");
    Employee e2 = new Employee("Sum", "Chum", "555555555");
    Employee e3 = new Employee("Chan", "Dan", "333333334");
    Employee e4 = new Employee("Doe", "John", "333333333");
    
    
    
    List list = new ArrayList();
    
    list.add(e0);
    list.add(e1);
    list.add(e2);
    list.add(e3);
    list.add(e4);
    
    
    for(int i = 0; i < list.size(); i++){
    
        Employee e = (Employee) list.get(i);
        
        System.out.println(e.toString());
        System.out.println("");
    }
    
    
    } 
    
}
