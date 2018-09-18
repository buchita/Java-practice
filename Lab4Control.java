package lab4;

public class Control
{
    public static void main(String[] args)
    {
        //account
        Account a1 =new Account("Buch", 123456,"1","dub",true,100);
        System.out.println(a1);
        double money = a1.deposit(100);
        System.out.println("Deposit is "+ money);
        double wit = a1.withdraw(10);
        System.out.println("Balance after withdraw is "+ wit);

        //deposit account
        DepositAccount a2 = new DepositAccount(12, "Buch", 123456, "1", "dub", true, 100);
        String line = a2.withsdraw();
        System.out.println(line);


        //current account
        CurrentAccount a3 = new CurrentAccount(12, "Buch", 123456, "1", "dub", true, 100);
        String l2 = a3.withdraw1(10);
        System.out.println(l2);





    }
}
