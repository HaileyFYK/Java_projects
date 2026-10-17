public class Banking {
    private String name;
    private double balance;
    private double deposit;
    private double withdrawal;

    // Constructor
    public Banking() {
        name = null;
        balance = 0.0;
        deposit = 0.0;
        withdrawal = 0.0;
    }

    public double deposit_method(double deposit) {
        balance += deposit;
        return balance;
    }

    public double withdraw_method(double withdrawal) {
        balance -= withdrawal;
        return balance;
    }

    public void print_Ending_Balance() {
        System.out.println("Ending balance: " + balance);
    }

    public void Name(String Newname) {
        name = Newname;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}