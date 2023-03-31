package Middle_man;

import javax.print.DocFlavor.READER;
import javax.swing.Spring;

public class solution {
    {
        static void Main(Spring[] args)
        {
            Person person = new Person();
            Department department = person.GetDepartment();
            person = department.GetManager();
        }
    }
    class Person
    {
        public Department Department;
        public Department GetDepartment()
        {
            return Department;
        }
 
    }
 
    class Department
    {
        private READER Person _manager;
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
