//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        account act=new DebitAccount("DEBIT", 500);
        //CURRENT BALANCE 500
        System.out.println(act.toString());
        //PREVIOUS BALANCE+50
        act.deposit(50);
        System.out.println(act.toString());
        //TRYING TO WITHDRAW 550-600= INSUFFICIENT/ERROR returns to previous balance
        act.withdraw(600);
        System.out.println(act.toString());

        System.out.println("\n");


        account act2=new CreditAccount("CREDIT",1500);
        //CURRENT FUND 1500
        System.out.println(act2.toString());

        //PREVIOUS FUND 1500-200
        act2.withdraw(200);
        System.out.println(act2.toString());

        //PREVIOUS FUND 1300-2000 ...OVERPASSED //returns to previous fund
        act2.withdraw(2000);
        System.out.println(act2.toString());

        System.out.println("\n");
    }
}