/*package lab4;

public class Account
{
    //attributes
    private String acc_name;
    private int acc_num;
    private String sort_code;
    private String branch_name;
    private boolean in_credit;
    private static double acc_balance;

    //constructor
    public Account(String acc_name, int acc_num, String sort_code, String branch_name, boolean in_credit, double acc_balance)
    {
        this.acc_name = acc_name;
        this.acc_num = acc_num;
        this.sort_code = sort_code;
        this.branch_name = branch_name;
        this.in_credit = in_credit;
        this.acc_balance = acc_balance;
    }

    //getters and setters
    public String getAcc_name() {
        return acc_name;
    }

    public void setAcc_name(String acc_name) {
        this.acc_name = acc_name;
    }

    public int getAcc_num() {
        return acc_num;
    }

    public void setAcc_num(int acc_num) {
        this.acc_num = acc_num;
    }

    public String getSort_code() {
        return sort_code;
    }

    public void setSort_code(String sort_code) {
        this.sort_code = sort_code;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public boolean isIn_credit() {
        return in_credit;
    }

    public void setIn_credit(boolean in_credit) {
        this.in_credit = in_credit;
    }

    public double getAcc_balance() {
        return acc_balance;
    }

    public void setAcc_balance(double acc_balance) {
        this.acc_balance = acc_balance;
    }
    /* public void setAcc_balance(double acc_balance) {
        this.acc_balance = acc_balance;
    }



    //method for deposting money
    public double deposit(double dep_amount)
    {
        return acc_balance =acc_balance+dep_amount;

    }


    //method for withdraw money
    public double withdraw(double take_amount)
    {
        acc_balance =  acc_balance-take_amount;
        if(acc_balance<0)
        {
            in_credit = false;

        }
        else
        {
            in_credit = true;

        }

        return acc_balance;
    }

    //tostring method
    public String toString()
    {
        String content;
        content = "The balance is "+ acc_balance+"print the in credit "+in_credit;
        return content;
    }

}
*/