/*create a class employee having id,name and salary.
create constructors,getter ,setters.
In the name class create an array List containing 4 diff employee obj, using Stream API display the details of employee having salary > 400000 ,
Update the emp salary by 25% and display the same,
Convert the names of emp to uppercase and store it in another list named as empNames and display it.
*/


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private double salary;

    
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class Streamapiexample {
    public static void main(String[] args) {
     
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", 500000));
        employees.add(new Employee(2, "Jane", 450000));
        employees.add(new Employee(3, "Bob", 380000));
        employees.add(new Employee(4, "Alice", 420000));

     
        System.out.println("Employees with salary > 400000:");
        employees.stream()
                .filter(e -> e.getSalary() > 400000)
                .forEach(e -> System.out.println("ID: " + e.getId() + ", Name: " + e.getName() + ", Salary: " + e.getSalary()));

        
        System.out.println("\nEmployees with updated salary (25% increase):");
        employees.stream()
                .peek(e -> e.setSalary(e.getSalary() * 1.25))
                .forEach(e -> System.out.println("ID: " + e.getId() + ", Name: " + e.getName() + ", Updated Salary: " + e.getSalary()));

     
        List<String> empNames = employees.stream()
                .map(Employee::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

      
        System.out.println("\nEmployee Names in Uppercase:");
        empNames.forEach(System.out::println);
    }
}
