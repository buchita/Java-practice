package Lab3;

public class Hourly_Employee extends Employee
{
    //attributes in this class
    private double hourlyRate;
    private double hoursWorked;

    //constructor
    public Hourly_Employee(String firstName, String surName, int staffNumber, double annualSalary,double hourlyRate, double hoursWorked)
    {
        super(firstName, surName, staffNumber, annualSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;

    }



    //getter and setter for hourly rate
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    //getter and setter fro hours worked

    public double getHoursWorked() {
        return hoursWorked;
    }

    //overriding method
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }




    //calculate pay() method
    public double calpay()
    {
        return hoursWorked*hourlyRate;
    }

    public String toString()
    {
         return super.toString()+(" earned "+this.hourlyRate+ "euro. They worked " + this.hoursWorked+"hours");


    }

}
