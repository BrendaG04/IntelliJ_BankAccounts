public class DebitAccount extends account{
    DebitAccount (String _accountType, double _balance){
        this.AccountType=_accountType;
        this.Balance=_balance;
    }


    @Override
    public boolean deposit(double _amount) {
        if (_amount>0) {
            this.Balance = this.Balance + _amount;
        }
        else {
            System.out.println("INCORRECT AMOUNT");
            return false;
        }
        return true;
    }

    @Override
    public boolean withdraw(double _amount) {
        if (_amount>0 && _amount<=this.Balance){
            this.Balance=this.Balance - _amount;
        }
        else {
            System.out.println("INCORRECT AMOUNT OR INSUFFICIENT BALANCE");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
