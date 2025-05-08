package org.example;

public class Employee extends Person {

    private String employeeID;


    public Employee(String employeeID, String name,
                    String address, String phone, String email) {
        super(name, address, phone, email);
        this.employeeID = employeeID;
    }


    public void printInfo(){
        System.out.println("Name of employee:"+ getName());
        System.out.println("Address of employee:"+ getAddress());
    }


    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
}
