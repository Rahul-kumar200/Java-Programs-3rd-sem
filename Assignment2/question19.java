package Assignment2;

import java.util.ArrayList;
class SalesPerson1 {
    String name, phone_no, district;
    int arr[] = new int[7];

    SalesPerson1() {
        for (int i = 0; i < 7; i++) {
            arr[i] = 0;
        }
    }

    SalesPerson1(String name, String phone_no, String district) {
        this.name = name;
        this.phone_no = phone_no;
        this.district = district;
        for (int i = 0; i < 7; i++) {
            arr[i] = 0;
        }
    }

    void setDailyAmount(int day, int amt) {
        arr[day] = amt;
    }

    int GetDailyAmount(int day) {
        return arr[day];
    }

    int total = 0;

    int total() {
        for (int i = 0; i < 7; i++) {
            total += arr[i];
        }
        return total;
    }

    int total1 = 0, avg = 0;

    int average() {
        for (int i = 0; i < 7; i++) {
            total1 += arr[i];
        }
        avg = total1 / 7;
        return avg;
    }

    public String tostr() {
        return ("Name: " + name + "\nPhone_no: " + phone_no + "\nDistrict: " + district + "\nTotal_Sales: " + total()
                + "\nAverage: " + average());
    }
}
class SalesTeam {
    ArrayList<SalesPerson1> persons;
    String name;

    public SalesTeam(String name) {
        this.name = name;
        persons = new ArrayList<>();
    }

    public void addSalesPerson(SalesPerson1 p) {
        persons.add(p);
    }

    public void Report() {
        System.out.println("Sales team: " + name);
        int sales = 0;
        for (SalesPerson1 sp : persons)
            sales += sp.total();

        System.out.println("Net sale:" + sales);

        for (SalesPerson1 sp : persons)
            System.out.println(sp.toString());
    }
}

public class question19 {
    public static void main(String[] args) {
        SalesTeam t1= new SalesTeam("TeamABC");
        SalesPerson1 s1 = new SalesPerson1("Rajat", "9817604970", "Jind");
        SalesPerson1 s2 = new SalesPerson1("abc", "9999999999", "xyz");
        s1.setDailyAmount(0, 2000);
        s1.setDailyAmount(1, 5000);
        s1.setDailyAmount(2, 3000);
        s1.setDailyAmount(3, 6000);
        s1.setDailyAmount(4, 1000);
        s1.setDailyAmount(5, 4000);
        s2.setDailyAmount(0, 2000);
        s2.setDailyAmount(1, 5000);
        s2.setDailyAmount(2, 3000);
        s2.setDailyAmount(3, 6000);
        s2.setDailyAmount(4, 1000);
        s2.setDailyAmount(5, 4000);
        t1.addSalesPerson(s1);
        t1.addSalesPerson(s2);
        t1.Report();
    }
}