public abstract class account {
    protected double Balance;
    protected String AccountType;



    public abstract boolean deposit(double amount);
    public abstract boolean withdraw(double amount);


    @Override
    public String toString() {
        String content="";
        content= content+"The Account Type is: "+this.AccountType+"\n";
        content= content+"The account Balance is: "+this.Balance;
        return content;
    }
}
