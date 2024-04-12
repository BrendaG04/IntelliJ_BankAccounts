public class CreditAccount extends account implements CalculateInterest{
    private double CreditLimit;

    CreditAccount (String _accountType, double _CreditLimit){
        this.AccountType=_accountType;
        this.Balance=0;
        this.CreditLimit=_CreditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        CreditLimit = creditLimit;
    }

    //ABSTRACT methods
    @Override
    public boolean deposit(double amount) {
        if (this.Balance <=0){
            this.Balance=0;
            System.out.println("SORRY, NO BALANCE TO PAY");
            return false;
        }
        else if (this.Balance<amount) {
            System.out.println("The balance is less than the amount you are trying to pay");
            System.out.println(this.toString());
        }
        else {
            this.Balance=this.Balance- amount;
        }
        return false;
    }

    @Override
    public boolean withdraw(double amount) {
        if ((this.CreditLimit-this.Balance>=amount)){
            this.Balance=this.Balance+amount;
        }

        else {
            System.out.println("THE AMOUNT IS GREATER THAN THE REMAINING BALANCE");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String content= "The Account Type is: "+this.AccountType+"\n";
        content=content+ "Remaining fund:"+(this.CreditLimit-this.Balance);
        return content;
    }
}
