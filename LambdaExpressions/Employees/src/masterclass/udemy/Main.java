package masterclass.udemy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Employee john = new Employee("John Doe", 30);
        Employee wei = new Employee("Wei Zheng", 25);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);
        Employee red = new Employee("Red RidingHood", 35);
        Employee charming = new Employee("Prince Charming", 35);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(wei);
        employees.add(jack);
        employees.add(snow);
        employees.add(red);
        employees.add(charming);


        printEmployeesByAge(employees, "Employees over 30", employee -> employee.getAge() > 30);
        printEmployeesByAge(employees, "\nEmployees 30 and under", employee -> employee.getAge() <= 30);

//        System.out.println("\nEmployees 30 and younger:");
//        System.out.println("===========================");
//        employees.forEach(employee -> {
//           if(employee.getAge() <=30 ){
//               System.out.println(employee.getName());
//           }
//        });

        //Enhanced for loop
//        for(Employee employee: employees) {
//            if (employee.getAge() > 30) {
//
//                System.out.println(employee.getName());
//            }
//        }
    }

    private static void printEmployeesByAge(List<Employee> employees,
                                            String ageText,
                                            Predicate<Employee> ageCondition) {
        System.out.println(ageText);
        System.out.println("===================");
        for (Employee employee : employees) {
            if (employee.getAge() > 30) {
                System.out.println(employee.getName());
            }
        }
    }
}
