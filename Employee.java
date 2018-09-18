package Lab3;

public class Employee
{
    //attributes
    private String firstName;
    private String surName;
    private int staffNumber;
    private double annualSalary;

    //constructor for all the attributes
    public Employee(String firstName, String surName, int staffNumber, double annualSalary)
    {
        this.firstName = firstName;
        this.surName = surName;
        this.staffNumber = staffNumber;
        this.annualSalary = annualSalary;

    }

    //setter and getter for firstname
    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    //setter and getter for surname
    public String getSurName()
    {
        return surName;
    }

    public void setSurName(String surName)
    {
        this.surName = surName;
    }

    //setter and getter for staffnum
    public int getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(int staffNumber) {
        this.staffNumber = staffNumber;
    }

    //setter and getter for annualsalary
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary)
    {
        this.annualSalary = annualSalary;
    }

    //method for  calculate pay()
    public double calpay()
    {
//        double pay;
        return annualSalary/12;
//        return pay;
    }

    //tostring method
    public String toString()
    {
        String content;
        content = "This Employee is called "+ this.firstName+ " "+ this.surName + " and has a salary of "+ this.annualSalary;
        return content;
    }



}
