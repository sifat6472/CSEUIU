import java.sql.SQLOutput;

public class class2 {

    static int Account_trace = 0;

    protected String AccountId;
    public String OwnerName;
    private String PinNumber;
    protected double Balance;

    {
        this.AccountId = Account_trace + "";
        Account_trace++;
    }

    class2 (String name, String PinNumber, double initBalance){
        this.OwnerName = name;
        this.PinNumber = PinNumber;
        this.Balance = initBalance;
    }

    public boolean deposit(double amount, String PinNumber) {
        if(this.PinNumber.equals(PinNumber)){
            this.Balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount, String PinNumber ){
        if(this.PinNumber.equals(PinNumber)){
            if(amount < 0){
                return false;
            }
            if(amount <= Balance){
                this.Balance -= amount;
                return true;
            }
            return false;
        }
        return false;
    }

    public void show_balance(String PinNumber){
        if(this.PinNumber.equals(PinNumber))
            System.out.println("Account Balance " + this.Balance);
    }
}
