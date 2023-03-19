package o_o_p_employees.o_o_p_the_basics;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee.name = "Pawel";
        employee.age = 32;
        employee.jobTitle = "Project Manager";

        employee2.name = "Aga";
        employee2.age = 25;
        employee2.jobTitle = "Writer";

        employee3.name = "Ola";
        employee3.age = 20;
        employee3.jobTitle = "Drawer";

        bar(employee);
        bar(employee2);
        bar(employee3);

        System.out.println(employee.age);
        System.out.println(employee2.age);
        System.out.println(employee3.age);

    }

    static void bar(Employee e) { //parameter as a variable --> the name (here "e") can be as you like

        System.out.println(e.name + " is " + e.age + " years old and is a " + e.jobTitle);

        e.age = 20; // this statement changes value everywhere --> reference type! at lines 26-28

    }
}