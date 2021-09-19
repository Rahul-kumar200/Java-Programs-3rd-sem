package Assignment2;

public class Duration {

   private int startHr,startMin;  // instance varibles
    private int endHr,endMin; 


    public Duration ()    // constructor 
    {
        startHr=startMin=0;
        endHr=endMin=0;
    }
    public void setter(int a ,int b , int c, int d)   // to set the starting and ending timing 
    {
        startHr=a;
        startMin=b;
        endHr=c;
        endMin=d;
    }

    public void tostring()        // is used to return the timing in a proper format (HH:MM-HH:MM)
    {
        System.out.print("Timing : "+startHr +":"+ startMin  + " - " + endHr + ":" + endMin );

    }
    
    public int length()      // to calculate the duration of time
    {
        
    if(startHr==endHr)
    {
        return (endMin-startMin);
    }        

    else if(startHr+1==endHr)
    {
        return (60-startMin+endMin);
    }

    else
    {
        return ((endHr-(startHr+1))*60 +60-startMin+endMin );
    }

    }
}
