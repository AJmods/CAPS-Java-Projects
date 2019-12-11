package com.company.Chapter4.Problem5;

public class BankCharges {

    double endBalance=0;
    double checks=0;

    public BankCharges(double endBalance, double checks)
    {
        this.checks = checks;
        this.endBalance = endBalance;
    }

    double getFees()
    {
        double fees;
        if (checks<20) fees=.1*checks;
        else if (checks<=39) fees=.08*checks;
        else if (checks<=59) fees=.06*checks;
        else fees=.04*checks;
        if (endBalance<400) fees+=15;
        return fees;
    }
}
