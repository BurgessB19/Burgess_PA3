//Test Application
public class Application {
    public static void main (String[] args){

        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();
        double x;
        int i;

        saver1.setBalance(2000);
        saver2.setBalance(3000);
        x = 0.04;

            saver1.getAnnualInterestRate(x);
            saver2.getAnnualInterestRate(x);

            System.out.println("Saving account for Person 1");

            for (i = 0; i < 12; ++i) {
                System.out.print("Month " + (i + 1) + " -- ");
                saver1.printBal();
            }

            System.out.println("");

            System.out.println("Saving account for Person 2");
            System.out.println("");
            for (i = 0; i < 12; ++i) {
                System.out.print("Month " + (i + 1) + " -- ");
                saver2.printBal();
            }

            System.out.println("--------------------------------------------");
            x = SavingsAccount.modifyInterestRate();


            saver1.getAnnualInterestRate(x);
            saver2.getAnnualInterestRate(x);

            System.out.println("Saving account for Person 1");


            System.out.print("Month 13 -- ");
            saver1.printBal();


            System.out.println("");

            System.out.println("Saving account for Person 2");


            System.out.print("Month 13 -- ");
            saver2.printBal();







    }
}
