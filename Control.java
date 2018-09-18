package Lab3;

public class Control
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee("john","smith",120323,120000);
        System.out.println(e1);
        System.out.println("The calculated salary is " + e1.calpay());

        Employee e2 = new Hourly_Employee("john","smith",120323,0, 120, 10);
        System.out.println(e2);
    }
}
