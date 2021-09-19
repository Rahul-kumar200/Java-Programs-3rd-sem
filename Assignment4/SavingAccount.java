package Assignment4;

public class SavingAccount {
    
    public static double annualIntersetRate;
    private double savingBalance;

    public SavingAccount()          // default constructor
    {
        annualIntersetRate=0.0;
        savingBalance=0.0;
    }

    public SavingAccount(int intRate,int savBal)    // overloaded constructor
    {
        annualIntersetRate=intRate;
        savingBalance=savBal;
    }


    public double  calculateMonthlyInterest()
    {
        double intRate= savingBalance*annualIntersetRate/12;
        savingBalance+=intRate;

        return savingBalance;
    }

    public static void changeIntersetRate(Double newIntRate)
    {
        annualIntersetRate=newIntRate;
    }

    public void setSavingBalance(Double initialBalance)
    {
        savingBalance=initialBalance;
    }

    double getSavingBalance()
    {
        return savingBalance;
    }
}

 class TestSavingAccount
 {
     public static void main(String[] args) {
         
        SavingAccount S1=new SavingAccount();
        SavingAccount S2=new SavingAccount();

        S1.setSavingBalance(2000.00);
        S2.setSavingBalance(3000.00);

        SavingAccount.changeIntersetRate(0.04);
        S1.calculateMonthlyInterest();
        S2.calculateMonthlyInterest();
        
        System.out.println("Saving Balance of S1 with interset rate of 0.04  is :  "+ S1.getSavingBalance());
        System.out.println("Saving Balance of S2 with interset rate of 0.04  is : "+ S2.getSavingBalance());
        
        SavingAccount.changeIntersetRate(0.05);
        S1.calculateMonthlyInterest();
        S2.calculateMonthlyInterest();
        
        System.out.println("Saving Balance of S1 with interset rate of 0.05  is : "+ S1.getSavingBalance());
        System.out.println("Saving Balance of S2 with interset rate of 0.05  is : "+ S2.getSavingBalance());

     }
 }
