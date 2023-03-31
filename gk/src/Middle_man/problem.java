package Middle_man;

import java.io.Reader;

import javax.swing.Spring;

public class problem {
    class Program
 {
    void Main(Spring[] args)
     {
         Person person = new Person();
         person = person.GetManager();
     }
 }
 
 
 class Person
 {
     public Department Department; { get; set; }
     public Person GetManager()
     {
         return Department.GetManager();
     }
 }
 
 
 class Department
 {
     private Reader Person _manager;
     public Department(Person manager)
     {
         _manager = manager;
     }
     public Person GetManager()
     {
         return _manager;
     }
 }
    
}
