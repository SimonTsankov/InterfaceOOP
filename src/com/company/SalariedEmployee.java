package com.company;

public class SalariedEmployee extends  Employee {

    private double weeklySalary;

    public SalariedEmployee(String first, String last, String ssn,double salary){
        super(first,last,ssn);
        setWeeklySalary(salary);
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if( weeklySalary>0)
        this.weeklySalary = weeklySalary;
        else this.weeklySalary=0.0;
    }

    public double getPaymentAmount(){
        return getWeeklySalary();
    }
    public String toString(){
        return  String.format("salaried emplyee: %s \n%s: $%,.2f "
                ,super.toString(),"weekly salary", getWeeklySalary());
    }
}
