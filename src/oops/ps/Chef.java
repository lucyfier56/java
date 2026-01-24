package oops.ps;

import oops.interfaceclass.Employee;

public class Chef extends Employee {
    public Chef(String name, int employeeId){
        super(name, employeeId);
    }



    @Override
    public void work(){
        System.out.println("Chef makes pizza");
    }
}
