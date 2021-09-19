package Assignment4;

public class que13 {    // driver class
    public static void main(String[] args) {
        
        Book B1=new Book();
        B1.set(232,780);
        B1.message();

        Novel N1=new Novel();
        N1.set(320,150,6);
        N1.message();

        Magazine M1=new Magazine();
        M1.set(130,95,13);
        M1.message();

        Textbook T1=new Textbook();
        T1.set(560,240,11);
        T1.message();
    }
}

class Book    // book class
{
    int noOfPages;
    int price;

    void set(int a,int b)
    {
        noOfPages=a;
        price=b;
    }

    void message()
    {
        System.out.println("This is a amazing book with "+ noOfPages+" of pages and has a price of Rs"+ price);
    }
}
class Novel
{
    int noOfPages;
    int price;
    int noOfCharacter;

    void set(int a,int b,int c)
    {
        noOfPages=a;
        price=b;
        noOfCharacter=c;
    }

    void message()
    {
        System.out.println("This is a amazing novel with "+noOfCharacter +" no of primary character  and "+ noOfPages+" of pages and has a price of Rs"+ price);
    }
}

class Magazine
{
    int noOfPages;
    int price;
    int noOfArticle;

    void set(int a,int b,int c)
    {
        noOfPages=a;
        price=b;
        noOfArticle=c;
    }

    void message()
    {
        System.out.println("This is a amazing magazine with "+noOfArticle +" no of Article  and "+ noOfPages+" of pages and has a price of Rs"+ price);
    }
}

class Textbook
{
    int noOfPages;
    int price;
    int standard;

    void set(int a,int b,int c)
    {
        noOfPages=a;
        price=b;
        standard=c;
    }

    void message()
    {
        System.out.println("This is a amazing Textbook for  " + standard + " class  and "+ noOfPages+" of pages and has a price of Rs"+ price);
    }
}
