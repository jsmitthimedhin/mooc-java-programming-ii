
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OS
 */
public class Employees {
    List<Person> employees = new ArrayList<>();
    
    public Employees() {
        
    }
    
    public void add(Person personToAdd) {
        employees.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream()
                .forEach(person -> employees.add(person));
    }
    
    public void print() {
        employees.stream()
                .forEach(employee -> System.out.println(employee));
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = employees.iterator();
        while(iterator.hasNext()) {
            Person nextPerson = iterator.next();
            if(nextPerson.getEducation()==education) {
                System.out.println(nextPerson);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();
        while(iterator.hasNext()) {
            if(iterator.next().getEducation()==education) {
                iterator.remove();
            }
        }
    }
}
