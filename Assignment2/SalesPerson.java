package Assignment2;

public class SalesPerson {

    String name;
    int phoneNo;
    String district;
    
    int dayNo;
    int amount[]=new int[7];

    public void SalesPerson(String n, int ph, String dis)  // constructor to set the details of the salesperson
    {
       name=n;
       phoneNo=ph;
       district=dis;
    } 

    public SalesPerson()  // setting everday amount as zero
    {
        for(int i=0;i<7;i++)
        {
            amount[i]=0;
        }
    }

    public  void setdailyAmount(int dno,int amt)    // setting the daily amount 
    {
        dayNo=dno;
        amount[dno]=amt;
    }

    public  int getDailyAmount(int dno) 
    {
        return(amount[dno]);
    }

    public  int total()    // total amount of week
    {
        int sum=0;
        for(int i=0;i<7;i++)
        {
            sum+=amount[i];
        }

        return sum; 
    }

    public  int average() //average amount for a week
    {
        int sum=0;
        for(int i=0;i<7;i++)
        {
            sum+=amount[i];
        }

        return (sum/7); 
    }

    public  void tostring()     // display the details of the salesperson
    {
        System.out.println("\nDetails-----------------------------");   

        System.out.println("Name :" + name);   
        System.out.println("Phone no. :" + phoneNo);   
        System.out.println("District :" + district);   
        
        System.out.println("\nDay no.\t\t Amount");
        
        for(int i=0;i<7;i++)
        {
            System.out.println(i +"\t\t" +amount[i]);
        }
    }

    
}

