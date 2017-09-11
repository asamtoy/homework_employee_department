package example.codeclan.com.employee_starter;

/**
 * Created by user on 22/02/2017.
 */

public class Runner {
    public static void main(String[] args){
        Department department1 = new Department("HR");
        Department department2 = new Department("Marketing");

        department1.save();
        department2.save();

        Department department3 = new Department("Sales");
        Department department4 = new Department("Finance");
        Department department5 = new Department("Admin");
        Department department6 = new Department("management team");
        department6.save();

        department3.save();
        department4.save();
        department5.save();

        Employee employee2 = new Employee("Jamie Jones", department2, 25000);
        Employee employee1 = new Employee("Suzie Smith", department1, 45000);

        employee1.save();
        employee2.save();

        Employee employee3 = new Employee("Andrew Samtoy", department3, 60000);
        Employee employee4 = new Employee("Charles Michener", department5, 80000);
        employee3.save();
        employee4.save();

        department6.delete();
        department5.update();

//        Department.deleteAll();

        employee4.setName("John Holmes");
        employee3.setSalary(65000);
        employee2.delete();
        employee1.setName("Suzie 'Samantha' Smith");
        

    }
}
