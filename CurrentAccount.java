/*package lab4;

public class CurrentAccount extends Account {
    //attribute
    private double penalty_amount;

    //constructor
    public CurrentAccount(double penalty_amount, String acc_name, int acc_num, String sort_code, String branch_name, boolean in_credit, double acc_balance) {
        super(acc_name, acc_num, sort_code, branch_name, in_credit, acc_balance);
        this.penalty_amount = penalty_amount;
    }


    //getter and setter
    public double getPenalty_amount() {
        return penalty_amount;
    }

    public void setPenalty_amount(double penalty_amount) {
        this.penalty_amount = penalty_amount;
    }


    //method for withdrawing moeny
    public String withdraw1(double take_amount) {
        if (super.getAcc_balance() < take_amount && super.getAcc_balance() < 0) {
            return "Insufficient Funds";
        } else {
            return "Proceed to withdraw";
        }
    }


}
*/