package solid_principles.single_resposibility.problem;

//    In the below example, the Employee class has a few employee class-specific behaviors like getDesignation & updateSalary.
//    Additionally, it also has another method named sendMail which deviates from the responsibility of the Employee class.
public class Employee {

    public String getDesignation(int employeeID){
        return "";
    }
    public void updateSalary(int employeeID){
        // code to update salary
    }
    public void sendMail(){}

}