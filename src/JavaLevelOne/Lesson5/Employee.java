package JavaLevelOne.Lesson5;

public class Employee {
    private String nameEmployee;
    private String position;
    private String email;
    private String phone;
    private int  salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age){
        this.nameEmployee = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getNameEmployee(){
        return nameEmployee;
    }
    public int getAge(){
        return age;
    }


    public static void employeeCard ( Employee x){

        System.out.println("Name: " + x.nameEmployee);
        System.out.println("position: " + x.position);
        System.out.println("email: " + x.email);
        System.out.println("phone: " + x.phone);
        System.out.println("salary: " + x.salary);
        System.out.println("age: " + x.age);

    }
}
