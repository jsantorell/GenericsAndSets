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
public class Lab3 {

    /*
    Lab #3 – do the same work as you did in lab #2 but this time use generics.
    How is this code different? Show your instructor. 
     */
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        Employee e0 = new Employee("Doe", "John", "333333333");
        Employee e1 = new Employee("Dane", "Jane", "444444444");
        Employee e2 = new Employee("Sum", "Chum", "555555555");
        Employee e3 = new Employee("Chan", "Dan", "333333334");
        Employee e4 = new Employee("Doe", "John", "333333333");

        list.add(e0);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        for (Employee e : list) {
            System.out.println(e.toString());
            System.out.println("");

        }

    }
}
