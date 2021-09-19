package Assignment4;

public class NumberOfSixes {

    int noOfSixes;

    NumberOfSixes()   // constructor set no of sixes value to zero
    {
        noOfSixes=0;
    }

    void setSix() // increase the number of sixes value by one
    {
        noOfSixes++;
    }

    int getSix()
    {
        return noOfSixes;
    }
        
}

class SixTracker
{
    public static void main(String[] args) {
        
        NumberOfSixes T1=new NumberOfSixes();    
 
        T1.setSix();
        T1.setSix();
        T1.setSix();
        T1.setSix();
        T1.setSix();
        T1.setSix();
        int result=T1.getSix();

        System.out.print("Total number of sixes  by team T1 are : "+ result);
    }
}
