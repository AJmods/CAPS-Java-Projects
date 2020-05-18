package com.danda.chapter4.problem11;

import java.util.ArrayList;
import java.util.List;

public class InternetProvider {

    private final InternetPackage A = new InternetPackage('A', 9.95, 10, 2.00);
    private final InternetPackage B = new InternetPackage('B', 14.95, 20, 1.00);
    private final InternetPackage C = new InternetPackage('C', 19.59);

    private InternetPackage currentPackage;

    List<InternetPackage> internetPackages = new ArrayList<>();

    public InternetProvider(String packageLetter)
    {
        if (packageLetter.equalsIgnoreCase("A")) currentPackage = A;
        else if (packageLetter.equalsIgnoreCase("B")) currentPackage = B;
        else if (packageLetter.equalsIgnoreCase("C")) currentPackage = C;
        else
        {
            System.err.println("ERROR, PACKAGE INVALD");
            System.exit(0);
        }
        internetPackages.add(A);
        internetPackages.add(B);
        internetPackages.add(C);
    }
    public InternetPackage getPackage(int i)
    {
        return internetPackages.get(i);
    }
    public double getCharge(int hoursUsed)
    {
        return currentPackage.getTotalCharge(hoursUsed);
    }
    public double getOtherPackageCharged(int i)
    {
        return internetPackages.get(i).getTotalCharge(i);
    }
    public int getInternetPackageCount()
    {
        return internetPackages.size();
    }
    public ArrayList<Double> getAllCharges(int hoursUsed)
    {
        ArrayList<Double> charges = new ArrayList<>();
        for (InternetPackage internetPackage : internetPackages)
        {
            charges.add(internetPackage.getTotalCharge(hoursUsed));
        }
        return charges;
    }
}
class InternetPackage
{
    char letter;
    double price;
    double hours;
    double addHoursPrice;

    public InternetPackage(char letter, double price) { this(letter,price,Double.MAX_VALUE,0);} //unlimited hours
    public InternetPackage(char letter, double price, double hours, double addHoursPrice)
    {
        this.letter = letter;
        this.price = price;
        this.hours = hours;
        this.addHoursPrice = addHoursPrice;
    }

    public double getTotalCharge(int hoursUsed)
    {
        double charge = 0;
        if (hoursUsed <= hours)
        {
            charge+=price;
        }
        else
        {
            charge+=price;
            hoursUsed-=hours;
            charge+=(addHoursPrice*hoursUsed);
        }
        return charge;
    }

    public char getLetter() {
        return letter;
    }

    public double getAddHoursPrice() {
        return addHoursPrice;
    }

    public double getHours() {
        return hours;
    }

    public double getPrice() {
        return price;
    }

    public void setAddHoursPrice(double addHoursPrice) {
        this.addHoursPrice = addHoursPrice;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
