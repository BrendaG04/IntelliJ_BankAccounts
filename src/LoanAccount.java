public class LoanAccount extends account implements CalculateInterest {
    private double loan;

    LoanAccount(String _accountType, double _loan){
        this.AccountType=_accountType;
        this.Balance=0;
        this.loan=_loan;
    }
    public void setLoan(double _loan) {
        this.loan = _loan;
    }

    //DEPOSITING THE LOAN
    @Override
    public boolean deposit(double _amount) {
        if (_amount>0) {
            this.loan = this.loan + _amount;
        }
        else {
            System.out.println("NO LOAN");
            return false;
        }
        return true;
    }

    @Override
    public boolean withdraw(double _amount) {
        return false;
    }

    @Override
    public String toString() {
        double interestAmount=CalculateInterest.rate(loan);
        String content= "The Account Type is: "+this.AccountType+"\n";
        content=content+ "Loan Amount:"+(this.loan+this.Balance) + " \nInterest:"+ (interestAmount);
        return content;
    }
}
