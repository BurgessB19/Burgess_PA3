public class SavingsAccount {

    private static double annualInterestRate;
    private double savingBalance;


    public double calculateMonthlyInterest(){
       double monthlyInterest;
    monthlyInterest = savingBalance * (annualInterestRate/12);
    return monthlyInterest;

    }

    public void setBalance(double balance){

        savingBalance = calculateMonthlyInterest() + balance;

    }
    public double getBalance() {

        savingBalance = calculateMonthlyInterest() + savingBalance;
        savingBalance = Math.round(savingBalance * 100);
        savingBalance = savingBalance/100;
        return savingBalance;
    }





    public double getAnnualInterestRate(double interest){
        annualInterestRate = interest;
        return annualInterestRate;
    }
    public static double modifyInterestRate(){

        //Scanner sc = new Scanner(System.in);
        double userIn;
        double x;

        userIn = .05;
        x = userIn;

        return x;
    }


    public void printBal(){
        System.out.println(getBalance());

    }
}
