package Assignment2;
import java.lang.Math;

public class randomPassword {

public static void main(String[] args) {
    
    char[] pwd = new char[10];

    pwd[0]=(char)(Math.random()*3+55); 

    for(int i=1;i<6;i++)
    {
        pwd[i]=(char)(Math.random()*10+48); 
    }
    
    pwd[6]='-';
    
    for(int i=7;i<10;i++)
    {
        pwd[i]=(char)(Math.random()*26+65); 
    }

    System.out.print(" Your Generated password is : ");
    for(int i=0;i<10;i++)
    {
        System.out.print( pwd[i]); 
    }

}

}
